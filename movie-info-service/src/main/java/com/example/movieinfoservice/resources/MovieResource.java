package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import com.example.movieinfoservice.services.MovieRowMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = mongoClient.getDatabase("movie_cache");
    MongoCollection<Document> collection = database.getCollection("movies");


    @Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate;

    public MovieResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private void cacheData(String movieId, String name, String description) {
        Document doc = new Document("movieId", movieId)
                .append("name", name)
                .append("description", description);

        collection.insertOne(doc);
    }

    private Movie getCachedData(String movieId) {
        Document doc = collection.find(eq("movieId", movieId)).first();
        if (doc == null)
            return null;
        Movie movie = new MovieRowMapper().getMovie(doc);
        return movie;
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        Movie CachedData = getCachedData(movieId);
        if (CachedData != null)
            return CachedData;

        // Get the movie info from TMDB
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);
        cacheData(movieId, movieSummary.getTitle(), movieSummary.getOverview());
        return getCachedData(movieId);
    }
}