package com.example.topmoviesservice.models;

import java.util.List;
import java.util.stream.Collectors;

import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMovies;

public class MovieSummaryList {
    private List<MovieSummary> results;

    public List<MovieSummary> getResults() {
        return results;
    }

    public void setResults(List<MovieSummary> results) {
        this.results = results;
    }

    public response toResponse() {
        List<topMovies> topMoviesList = results.stream()
            .map(summary -> topMovies.newBuilder()
                    .setMovieId(summary.getId())
                    .setTitle(summary.getTitle())
                    .setDescription(summary.getOverview())
                    .setRating(summary.getVoteAverage())
                    .build())
            .limit(10)
            .collect(Collectors.toList());

        response.Builder responseBuilder = response.newBuilder()
                .addAllMovie(topMoviesList);

        return responseBuilder.build();
        
    }

    // public response toResponse() {
        // response.Builder responseBuilder = response.newBuilder();

        // List<MovieSummary> topTenResults = results.subList(0, 10);
        // for (MovieSummary summary : topTenResults) {
        //     topMovies.Builder movieBuilder = topMovies.newBuilder();
        //     movieBuilder.setMovieId(summary.getId());
        //     movieBuilder.setTitle(summary.getTitle());
        //     movieBuilder.setDescription(summary.getOverview());
        //     movieBuilder.setRating(summary.getVoteAverage());

        //     responseBuilder.addMovie(movieBuilder.build());
        // }

        // return responseBuilder.build();
    // }

    // public String getString(){
    //     StringBuilder stringBuilder = new StringBuilder();
    //     for (MovieSummary summary : results) {
    //         stringBuilder.append("{movieID:" + summary.getId());
    //         stringBuilder.append(", title:" + summary.getTitle());
    //         stringBuilder.append(", disc:" + summary.getOverview());
    //         stringBuilder.append(", vote:" + summary.getVoteAverage()+ "},");
    //     }

    //     return stringBuilder.toString();
    // }
}
