package com.moviecatalogservice;

import com.moviecatalogservice.utils.request;
import com.moviecatalogservice.utils.response;
import com.moviecatalogservice.utils.topMovies;
import com.moviecatalogservice.utils.topMoviesServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewGrpcMain {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8090)
                .usePlaintext()
                .build();
        topMoviesServiceGrpc.topMoviesServiceBlockingStub stub = topMoviesServiceGrpc.newBlockingStub(channel);
        request req = request.newBuilder().setMovie(topMovies.newBuilder().setMovieId("").setRanting(0).build())
                .build();
        response resp = stub.requestTopMovies(req);
        System.out.println(resp);
    }

}
