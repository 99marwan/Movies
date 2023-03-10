package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
// import com.example.movieinfoservice.services.CacheService;
import com.example.movieinfoservice.services.MovieRowMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
// import java.util.HashMap;
// import java.util.Map;


@RestController
@RequestMapping("/movies")
public class MovieResource {
    // @Autowired
    // private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
        // String sql = "INSERT INTO movie_cache (movieId, name, description) VALUES (:movieId, :name, :description)";
        // Map<String, Object> params = new HashMap<>();
        // params.put("movieId", movieId);
        // params.put("name", name);
        // params.put("description", description);

        // namedParameterJdbcTemplate.query(sql, params, new MovieRowMapper());
        Document doc = new Document("movieId", movieId)
                .append("name", name)
                .append("description", description);

        collection.insertOne(doc);
    }

    private Movie getCachedData(String movieId) {
        Document doc = collection.find(eq("movieId", movieId)).first();

        // String sql = "SELECT movieId, name, description FROM movie_cache WHERE movieId = :movieId";
        // Map<String, Object> params = new HashMap<>();
        // params.put("movieId", movieId);
        // Movie movie = namedParameterJdbcTemplate.queryForObject(sql, params, new MovieRowMapper());

        Movie movie = new MovieRowMapper().getMovie(doc);
        return movie;
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        Movie CachedData = getCachedData(movieId);
        if (CachedData != null) {

            return CachedData;
        }
        // Get the movie info from TMDB
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);

        cacheData(movieId, movieSummary.getTitle(), movieSummary.getOverview());

        return getCachedData(movieId);
    }
}