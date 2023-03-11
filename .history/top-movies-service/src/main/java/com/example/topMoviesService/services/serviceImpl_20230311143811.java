package com.example.topmoviesservice.services;

import com.example.topmoviesservice.utils.request;
import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc;

public class serviceImpl extends topMoviesServiceGrpc.topMoviesServiceImplBase {
    @Override
    public void requestTopMovies(request request, io.grpc.stub.StreamObserver<response> responseObserver) {
        asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver);
    }

}
