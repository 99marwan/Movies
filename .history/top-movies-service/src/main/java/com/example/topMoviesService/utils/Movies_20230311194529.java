package com.example.topmoviesservice.utils;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Movies.proto

public final class Movies {
  private Movies() {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor internal_static_topMovies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_topMovies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor internal_static_request_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor internal_static_response_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = {
        "\n\014Movies.proto\"P\n\ttopMovies\022\017\n\007movieId\030\001" +
            " \001(\t\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 \001(\t" +
            "\022\016\n\006rating\030\004 \001(\001\"\t\n\007request\"%\n\010response\022" +
            "\031\n\005movie\030\001 \003(\0132\n.topMovies2;\n\020topMoviesS" +
            "ervice\022\'\n\020requestTopMovies\022\010.request\032\t.r" +
            "esponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
          com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
            }, assigner);
    internal_static_topMovies_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_topMovies_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_topMovies_descriptor,
        new java.lang.String[] { "MovieId", "Title", "Description", "Rating", });
    internal_static_request_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_request_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_request_descriptor,
        new java.lang.String[] {});
    internal_static_response_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_response_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_response_descriptor,
        new java.lang.String[] { "Movie", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
