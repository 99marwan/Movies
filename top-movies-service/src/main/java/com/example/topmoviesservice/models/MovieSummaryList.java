package com.example.topmoviesservice.models;

import java.util.List;

public class MovieSummaryList {
    private List<MovieSummary> results;

    public List<MovieSummary> getResults() {
        return results;
    }

    public void setResults(List<MovieSummary> results) {
        this.results = results;
    }

    public String getString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (MovieSummary summary : results) {
            stringBuilder.append("{movieID:" + summary.getId());
            stringBuilder.append(", title:" + summary.getTitle());
            stringBuilder.append(", disc:" + summary.getOverview());
            stringBuilder.append(", vote:" + summary.getVoteAverage()+ "},");
        }

        return stringBuilder.toString();
    }
}
