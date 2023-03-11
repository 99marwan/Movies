package com.example.topmoviesservice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.topmoviesservice.services.serviceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class RatingsDataServiceApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(5003)
                .addService(new serviceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }

}
