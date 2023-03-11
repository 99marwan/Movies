package com.example.topmoviesservice.services;

import com.example.topmoviesservice.utils.request;
import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc.topMoviesServiceImplBase;
import com.github.andrewoma.dexx.collection.List;
import com.google.rpc.context.AttributeContext.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.topmoviesservice.models.MovieSummary;

public class serviceImpl extends topMoviesServiceGrpc.topMoviesServiceImplBase {
    private RestTemplate restTemplate;
    @Value("${api.key}")
    private String apiKey;

    @Override
    public void requestTopMovies(request request, io.grpc.stub.StreamObserver<response> responseObserver) {
        /*
         * asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver)
         */
        HttpEntity<MovieSummary> entity = new HttpEntity<>(new MovieSummary());

        final String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=" + apiKey + "&page=1";
        ResponseEntity<MovieSummary> movieSummary = restTemplate.exchange(url, HttpMethod.GET, entity,
                MovieSummary.class);
        String result = movieSummary.toString();
        response resp = response.newBuilder().setResult(result).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

}
