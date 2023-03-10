package com.example.movieinfoservice.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    private final JdbcTemplate jdbcTemplate;

    public CacheService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void cacheData(String key, Object value) {
        jdbcTemplate.update("INSERT INTO movie_cache (movieId, name, description) VALUES (?, ?, ?)", key, value);
    }

    public Object getCachedData(String key) {
        return jdbcTemplate.queryForObject("SELECT value FROM cache WHERE key = ?", Object.class, key);
    }
}
