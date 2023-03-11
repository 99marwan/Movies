package com.example.topmoviesservice.services;

import com.example.topmoviesservice.utils.request;
import com.example.topmoviesservice.utils.response;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc;
import com.example.topmoviesservice.utils.topMoviesServiceGrpc.topMoviesServiceImplBase;
import com.example.movieinfoservice.models.*;

public class serviceImpl extends topMoviesServiceGrpc.topMoviesServiceImplBase {
    @Override
    public void requestTopMovies(request request, io.grpc.stub.StreamObserver<response> responseObserver) {
        /*
         * asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver)
         */
        int rating = (int) request.getMovie().getRanting();
        String movieId = request.getMovie().getMovieId();

        final String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=b0af84324ea41ca39f4311c9156e94e3&page=1";
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);
    }

}
