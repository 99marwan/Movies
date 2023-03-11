package com.example.ratingsservice.utils;
// Generated by the protocol buffer compiler.  DO NOT EDIT!

// source: Movies.proto

/**
 * Protobuf type {@code topMovies}
 */
public final class topMovies extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:topMovies)
    topMoviesOrBuilder {
  // Use topMovies.newBuilder() to construct.
  private topMovies(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private topMovies() {
    movieId_ = "";
    ranting_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  private topMovies(
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
            java.lang.String s = input.readStringRequireUtf8();

            movieId_ = s;
            break;
          }
          case 16: {

            ranting_ = input.readInt64();
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
    return Movies.internal_static_topMovies_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return Movies.internal_static_topMovies_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            topMovies.class, topMovies.Builder.class);
  }

  public static final int MOVIEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object movieId_;

  /**
   * <code>string movieId = 1;</code>
   */
  public java.lang.String getMovieId() {
    java.lang.Object ref = movieId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      movieId_ = s;
      return s;
    }
  }

  /**
   * <code>string movieId = 1;</code>
   */
  public com.google.protobuf.ByteString getMovieIdBytes() {
    java.lang.Object ref = movieId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
          (java.lang.String) ref);
      movieId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANTING_FIELD_NUMBER = 2;
  private long ranting_;

  /**
   * <code>int64 ranting = 2;</code>
   */
  public long getRanting() {
    return ranting_;
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
    if (!getMovieIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, movieId_);
    }
    if (ranting_ != 0L) {
      output.writeInt64(2, ranting_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (!getMovieIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, movieId_);
    }
    if (ranting_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, ranting_);
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
    if (!(obj instanceof topMovies)) {
      return super.equals(obj);
    }
    topMovies other = (topMovies) obj;

    boolean result = true;
    result = result && getMovieId()
        .equals(other.getMovieId());
    result = result && (getRanting() == other.getRanting());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MOVIEID_FIELD_NUMBER;
    hash = (53 * hash) + getMovieId().hashCode();
    hash = (37 * hash) + RANTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRanting());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static topMovies parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static topMovies parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static topMovies parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static topMovies parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static topMovies parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static topMovies parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static topMovies parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static topMovies parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static topMovies parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static topMovies parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static topMovies parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static topMovies parseFrom(
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

  public static Builder newBuilder(topMovies prototype) {
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
   * Protobuf type {@code topMovies}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:topMovies)
      topMoviesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return Movies.internal_static_topMovies_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return Movies.internal_static_topMovies_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              topMovies.class, topMovies.Builder.class);
    }

    // Construct using topMovies.newBuilder()
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
      movieId_ = "";

      ranting_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return Movies.internal_static_topMovies_descriptor;
    }

    public topMovies getDefaultInstanceForType() {
      return topMovies.getDefaultInstance();
    }

    public topMovies build() {
      topMovies result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public topMovies buildPartial() {
      topMovies result = new topMovies(this);
      result.movieId_ = movieId_;
      result.ranting_ = ranting_;
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
      if (other instanceof topMovies) {
        return mergeFrom((topMovies) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(topMovies other) {
      if (other == topMovies.getDefaultInstance())
        return this;
      if (!other.getMovieId().isEmpty()) {
        movieId_ = other.movieId_;
        onChanged();
      }
      if (other.getRanting() != 0L) {
        setRanting(other.getRanting());
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
      topMovies parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (topMovies) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object movieId_ = "";

    /**
     * <code>string movieId = 1;</code>
     */
    public java.lang.String getMovieId() {
      java.lang.Object ref = movieId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        movieId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string movieId = 1;</code>
     */
    public com.google.protobuf.ByteString getMovieIdBytes() {
      java.lang.Object ref = movieId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
            (java.lang.String) ref);
        movieId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieId(
        java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      movieId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string movieId = 1;</code>
     */
    public Builder clearMovieId() {

      movieId_ = getDefaultInstance().getMovieId();
      onChanged();
      return this;
    }

    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      movieId_ = value;
      onChanged();
      return this;
    }

    private long ranting_;

    /**
     * <code>int64 ranting = 2;</code>
     */
    public long getRanting() {
      return ranting_;
    }

    /**
     * <code>int64 ranting = 2;</code>
     */
    public Builder setRanting(long value) {

      ranting_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int64 ranting = 2;</code>
     */
    public Builder clearRanting() {

      ranting_ = 0L;
      onChanged();
      return this;
    }

    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    // @@protoc_insertion_point(builder_scope:topMovies)
  }

  // @@protoc_insertion_point(class_scope:topMovies)
  private static final topMovies DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new topMovies();
  }

  public static topMovies getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<topMovies> PARSER = new com.google.protobuf.AbstractParser<topMovies>() {
    public topMovies parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new topMovies(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<topMovies> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<topMovies> getParserForType() {
    return PARSER;
  }

  public topMovies getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
