package com.moviecatalogservice;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewGrpcMain {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
            .usePlaintext()
            .build();

}
