package com.example.topmoviesservice.services;
// Generated by the protocol buffer compiler.  DO NOT EDIT!

import com.example.topmoviesservice.utils.topMovies;
import com.example.topmoviesservice.utils.topMoviesOrBuilder;
import com.example.topmoviesservice.utils.Movies;
import com.example.topmoviesservice.utils.requestOrBuilder;

// source: Movies.proto

/**
 * Protobuf type {@code request}
 */
public final class request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:request)
    requestOrBuilder {
  // Use request.newBuilder() to construct.
  private request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private request() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  private request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            topMovies.Builder subBuilder = null;
            if (movie_ != null) {
              subBuilder = movie_.toBuilder();
            }
            movie_ = input.readMessage(topMovies.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(movie_);
              movie_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return Movies.internal_static_request_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return Movies.internal_static_request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            request.class, request.Builder.class);
  }

  public static final int MOVIE_FIELD_NUMBER = 1;
  private topMovies movie_;

  /**
   * <code>.topMovies movie = 1;</code>
   */
  public boolean hasMovie() {
    return movie_ != null;
  }

  /**
   * <code>.topMovies movie = 1;</code>
   */
  public topMovies getMovie() {
    return movie_ == null ? topMovies.getDefaultInstance() : movie_;
  }

  /**
   * <code>.topMovies movie = 1;</code>
   */
  public topMoviesOrBuilder getMovieOrBuilder() {
    return getMovie();
  }

  private byte memoizedIsInitialized = -1;

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
    if (movie_ != null) {
      output.writeMessage(1, getMovie());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (movie_ != null) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMovie());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof request)) {
      return super.equals(obj);
    }
    request other = (request) obj;

    boolean result = true;
    result = result && (hasMovie() == other.hasMovie());
    if (hasMovie()) {
      result = result && getMovie()
          .equals(other.getMovie());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMovie()) {
      hash = (37 * hash) + MOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getMovie().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder()
        : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * Protobuf type {@code request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:request)
      requestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return Movies.internal_static_request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return Movies.internal_static_request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              request.class, request.Builder.class);
    }

    // Construct using request.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      if (movieBuilder_ == null) {
        movie_ = null;
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return Movies.internal_static_request_descriptor;
    }

    public request getDefaultInstanceForType() {
      return request.getDefaultInstance();
    }

    public request build() {
      request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public request buildPartial() {
      request result = new request(this);
      if (movieBuilder_ == null) {
        result.movie_ = movie_;
      } else {
        result.movie_ = movieBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }

    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }

    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof request) {
        return mergeFrom((request) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(request other) {
      if (other == request.getDefaultInstance())
        return this;
      if (other.hasMovie()) {
        mergeMovie(other.getMovie());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private topMovies movie_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<topMovies, topMovies.Builder, topMoviesOrBuilder> movieBuilder_;

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public boolean hasMovie() {
      return movieBuilder_ != null || movie_ != null;
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public topMovies getMovie() {
      if (movieBuilder_ == null) {
        return movie_ == null ? topMovies.getDefaultInstance() : movie_;
      } else {
        return movieBuilder_.getMessage();
      }
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public Builder setMovie(topMovies value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        movie_ = value;
        onChanged();
      } else {
        movieBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public Builder setMovie(
        topMovies.Builder builderForValue) {
      if (movieBuilder_ == null) {
        movie_ = builderForValue.build();
        onChanged();
      } else {
        movieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public Builder mergeMovie(topMovies value) {
      if (movieBuilder_ == null) {
        if (movie_ != null) {
          movie_ = topMovies.newBuilder(movie_).mergeFrom(value).buildPartial();
        } else {
          movie_ = value;
        }
        onChanged();
      } else {
        movieBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public Builder clearMovie() {
      if (movieBuilder_ == null) {
        movie_ = null;
        onChanged();
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }

      return this;
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public topMovies.Builder getMovieBuilder() {

      onChanged();
      return getMovieFieldBuilder().getBuilder();
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    public topMoviesOrBuilder getMovieOrBuilder() {
      if (movieBuilder_ != null) {
        return movieBuilder_.getMessageOrBuilder();
      } else {
        return movie_ == null ? topMovies.getDefaultInstance() : movie_;
      }
    }

    /**
     * <code>.topMovies movie = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<topMovies, topMovies.Builder, topMoviesOrBuilder> getMovieFieldBuilder() {
      if (movieBuilder_ == null) {
        movieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<topMovies, topMovies.Builder, topMoviesOrBuilder>(
            getMovie(),
            getParentForChildren(),
            isClean());
        movie_ = null;
      }
      return movieBuilder_;
    }

    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    // @@protoc_insertion_point(builder_scope:request)
  }

  // @@protoc_insertion_point(class_scope:request)
  private static final request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new request();
  }

  public static request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<request> PARSER = new com.google.protobuf.AbstractParser<request>() {
    public request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<request> getParserForType() {
    return PARSER;
  }

  public request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
