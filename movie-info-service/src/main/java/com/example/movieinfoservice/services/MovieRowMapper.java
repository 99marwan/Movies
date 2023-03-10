package com.example.movieinfoservice.services;

import com.example.movieinfoservice.models.Movie;
import org.bson.Document;



public class MovieRowMapper {

    public Movie getMovie(Document doc){
        Movie movie = new Movie();
        movie.setMovieId(doc.getString("movieId"));
        movie.setName(doc.getString("name"));
        movie.setDescription(doc.getString("description"));
        return movie;
    }
}