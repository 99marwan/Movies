// package com.example.movieinfoservice.services;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Service;

// import com.example.movieinfoservice.models.Movie;

// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

// @Service
// public class CacheService {
//     private final NamedParameterJdbcTemplate jdbcTemplate;

//     public CacheService(NamedParameterJdbcTemplate jdbcTemplate) {
//         this.jdbcTemplate = jdbcTemplate;
//     }

//     public void cacheData(String movieId, String name, String description) {
//         String sql = "INSERT INTO movie_cache (movieId, name, description) VALUES (:movieId, :name, :description)";
//         Map<String, Object> params = new HashMap<>();
//         params.put("movieId", movieId);
//         params.put("name", name);
//         params.put("description", description);

//         jdbcTemplate.query(sql, params, new MovieRowMapper());
//     }

//     public Movie getCachedData(String movieId) {
//         String sql = "SELECT movieId, name, description FROM movie_cache WHERE movieId = :movieId";
//         Map<String, Object> params = new HashMap<>();
//         params.put("movieId", movieId);
//         Movie movie = jdbcTemplate.queryForObject(sql, params, new MovieRowMapper());
//         return movie;
//     }
// }
