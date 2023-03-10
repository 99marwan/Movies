package com.example.ratingsservice.resources;

import com.example.ratingsservice.models.Rating;
import com.example.ratingsservice.models.UserRating;
import com.example.ratingsservice.services.RatingRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/{userId}")
    public UserRating getRatingsOfUser(@PathVariable String userId) {
        String sql = "SELECT movie_id, rating FROM user_ratings WHERE user_id = :userId";
        List<Rating> ratings = jdbcTemplate.query(sql, new RatingRowMapper());
        // new MapSqlParameterSource()
        // .addValue("userId", userId);
        // }
        return new UserRating(ratings);
    }
}
