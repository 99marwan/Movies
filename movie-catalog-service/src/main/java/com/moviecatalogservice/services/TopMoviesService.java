package com.moviecatalogservice.services;

import com.moviecatalogservice.models.Movie;
import com.moviecatalogservice.models.Rating;
import com.moviecatalogservice.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.moviecatalogservice.utils.request;
import com.moviecatalogservice.utils.response;
import com.moviecatalogservice.utils.topMovies;
import com.moviecatalogservice.utils.topMoviesServiceGrpc;

import java.util.Collections;
import java.util.Objects;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class TopMoviesService {

    private final RestTemplate restTemplate;

    public TopMoviesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getTopTen() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
            .usePlaintext()
            .build();
        topMoviesServiceGrpc.topMoviesServiceBlockingStub stub = topMoviesServiceGrpc.newBlockingStub(channel);
        request req = request.newBuilder().build();
        response resp = stub.requestTopMovies(req);
        
        return resp.getResult();
    }
}
