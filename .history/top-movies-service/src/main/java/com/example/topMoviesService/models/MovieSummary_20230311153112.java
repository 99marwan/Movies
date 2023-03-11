package com.example.topmoviesservice.models;

public class MovieSummary {
    private String id;
    private String title;
    private String overview;
    private double vote_average;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setVoteAverage(double voteAverage) {
        this.vote_average = voteAverage;
    }

    public double getVoteAverage() {
        return vote_average;
    }

}
