package com.example.topmoviesservice.services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import com.example.topmoviesservice.utils.Movies;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(value = "by gRPC proto compiler (version 1.4.0)", comments = "Source: Movies.proto")
public final class topMoviesServiceGrpc {

  private topMoviesServiceGrpc() {
  }

  public static final String SERVICE_NAME = "topMoviesService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<request, response> METHOD_REQUEST_TOP_MOVIES = io.grpc.MethodDescriptor
      .<request, response>newBuilder()
      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(generateFullMethodName(
          "topMoviesService", "requestTopMovies"))
      .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
          request.getDefaultInstance()))
      .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
          response.getDefaultInstance()))
      .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static topMoviesServiceStub newStub(io.grpc.Channel channel) {
    return new topMoviesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output
   * calls on the service
   */
  public static topMoviesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new topMoviesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the
   * service
   */
  public static topMoviesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new topMoviesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class topMoviesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void requestTopMovies(request request,
        io.grpc.stub.StreamObserver<response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REQUEST_TOP_MOVIES, responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              METHOD_REQUEST_TOP_MOVIES,
              asyncUnaryCall(
                  new MethodHandlers<request, response>(
                      this, METHODID_REQUEST_TOP_MOVIES)))
          .build();
    }
  }

  /**
   */
  public static final class topMoviesServiceStub extends io.grpc.stub.AbstractStub<topMoviesServiceStub> {
    private topMoviesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topMoviesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMoviesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topMoviesServiceStub(channel, callOptions);
    }

    /**
     */
    public void requestTopMovies(request request,
        io.grpc.stub.StreamObserver<response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REQUEST_TOP_MOVIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class topMoviesServiceBlockingStub
      extends io.grpc.stub.AbstractStub<topMoviesServiceBlockingStub> {
    private topMoviesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topMoviesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMoviesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topMoviesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public response requestTopMovies(request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REQUEST_TOP_MOVIES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class topMoviesServiceFutureStub extends io.grpc.stub.AbstractStub<topMoviesServiceFutureStub> {
    private topMoviesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topMoviesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMoviesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topMoviesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<response> requestTopMovies(
        request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REQUEST_TOP_MOVIES, getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_TOP_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final topMoviesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(topMoviesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_TOP_MOVIES:
          serviceImpl.requestTopMovies((request) request,
              (io.grpc.stub.StreamObserver<response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class topMoviesServiceDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Movies.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (topMoviesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new topMoviesServiceDescriptorSupplier())
              .addMethod(METHOD_REQUEST_TOP_MOVIES)
              .build();
        }
      }
    }
    return result;
  }
}
