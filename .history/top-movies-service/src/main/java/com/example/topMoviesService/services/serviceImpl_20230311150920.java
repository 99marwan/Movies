package com.example.topmoviesservice.services;

import com.example.topmoviesservice.utils.request;
import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc.topMoviesServiceImplBase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class serviceImpl extends topMoviesServiceGrpc.topMoviesServiceImplBase {
    private RestTemplate restTemplate;
    @Value("${api.key}")
    private String apiKey;

    @Override
    public void requestTopMovies(request request, io.grpc.stub.StreamObserver<response> responseObserver) {
        /*
         * asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver)
         */
        int rating = (int) request.getMovie().getRanting();
        String movieId = request.getMovie().getMovieId();

        final String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=" + apiKey + "&page=1";
        List<MovieSummary> movieSummary = restTemplate.exchange(null, null, null, null);
    }

}
