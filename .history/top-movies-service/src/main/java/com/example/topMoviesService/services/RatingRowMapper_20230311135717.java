package com.example.topmoviesservice.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.topmoviesservice.models.Rating;

public class RatingRowMapper implements RowMapper<Rating> {

    @Override
    public Rating mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rating rating = new Rating();
        rating.setMovieId(rs.getString("movie_id"));
        rating.setRating(rs.getInt("rating"));
        return rating;
    }

}
