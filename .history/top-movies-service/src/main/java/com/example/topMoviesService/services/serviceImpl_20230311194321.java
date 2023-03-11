package com.example.topmoviesservice.services;

import com.example.topmoviesservice.utils.request;
import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc.topMoviesServiceImplBase;
import com.github.andrewoma.dexx.collection.List;
import com.google.rpc.context.AttributeContext.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import com.example.topmoviesservice.models.MovieSummary;
import com.example.topmoviesservice.models.MovieSummaryList;

public class serviceImpl extends topMoviesServiceGrpc.topMoviesServiceImplBase {
    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${api.key}")
    private String apiKey;

    @Override
    public void requestTopMovies(request request, io.grpc.stub.StreamObserver<response> responseObserver) {
        /*
         * asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver)
         */
        // HttpEntity<MovieSummary> entity = new HttpEntity<>(new MovieSummary());

        /*
         * final String url =
         * "https://api.themoviedb.org/3/movie/top_rated?api_key=b0af84324ea41ca39f4311c9156e94e3";
         * MovieSummaryList movieSummary =
         * restTemplate.getForObject(url,MovieSummaryList.class);
         * 
         * response resp =
         * response.newBuilder().setResult(movieSummary.getString()).build();
         * responseObserver.onNext(resp);
         * responseObserver.onCompleted();
         */
    }

}
