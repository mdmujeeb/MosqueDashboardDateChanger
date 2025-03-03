// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mosque-dashboard.proto

package com.mujeeb.mosquedashboard.grpc;

/**
 * <pre>
 * Request Beans
 * </pre>
 *
 * Protobuf type {@code com.mujeeb.mosquedashboard.grpc.NamazTime}
 */
@SuppressWarnings("deprecation")
public final class NamazTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.mujeeb.mosquedashboard.grpc.NamazTime)
    NamazTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NamazTime.newBuilder() to construct.
  private NamazTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NamazTime() {
    namazTimeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NamazTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NamazTime(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.mujeeb.mosquedashboard.grpc.AuthData.Builder subBuilder = null;
            if (authData_ != null) {
              subBuilder = authData_.toBuilder();
            }
            authData_ = input.readMessage(com.mujeeb.mosquedashboard.grpc.AuthData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(authData_);
              authData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            namazTimeName_ = s;
            break;
          }
          case 24: {

            hour_ = input.readInt32();
            break;
          }
          case 32: {

            minute_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
//      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mujeeb.mosquedashboard.grpc.MosqueDashboardProto.internal_static_com_mujeeb_mosquedashboard_grpc_NamazTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mujeeb.mosquedashboard.grpc.MosqueDashboardProto.internal_static_com_mujeeb_mosquedashboard_grpc_NamazTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mujeeb.mosquedashboard.grpc.NamazTime.class, com.mujeeb.mosquedashboard.grpc.NamazTime.Builder.class);
  }

  public static final int AUTHDATA_FIELD_NUMBER = 1;
  private com.mujeeb.mosquedashboard.grpc.AuthData authData_;
  /**
   * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
   * @return Whether the authData field is set.
   */
  @java.lang.Override
  public boolean hasAuthData() {
    return authData_ != null;
  }
  /**
   * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
   * @return The authData.
   */
  @java.lang.Override
  public com.mujeeb.mosquedashboard.grpc.AuthData getAuthData() {
    return authData_ == null ? com.mujeeb.mosquedashboard.grpc.AuthData.getDefaultInstance() : authData_;
  }
  /**
   * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
   */
  @java.lang.Override
  public com.mujeeb.mosquedashboard.grpc.AuthDataOrBuilder getAuthDataOrBuilder() {
    return getAuthData();
  }

  public static final int NAMAZTIMENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object namazTimeName_;
  /**
   * <code>string namazTimeName = 2;</code>
   * @return The namazTimeName.
   */
  @java.lang.Override
  public java.lang.String getNamazTimeName() {
    java.lang.Object ref = namazTimeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namazTimeName_ = s;
      return s;
    }
  }
  /**
   * <code>string namazTimeName = 2;</code>
   * @return The bytes for namazTimeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamazTimeNameBytes() {
    java.lang.Object ref = namazTimeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namazTimeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOUR_FIELD_NUMBER = 3;
  private int hour_;
  /**
   * <code>int32 hour = 3;</code>
   * @return The hour.
   */
  @java.lang.Override
  public int getHour() {
    return hour_;
  }

  public static final int MINUTE_FIELD_NUMBER = 4;
  private int minute_;
  /**
   * <code>int32 minute = 4;</code>
   * @return The minute.
   */
  @java.lang.Override
  public int getMinute() {
    return minute_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (authData_ != null) {
      output.writeMessage(1, getAuthData());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namazTimeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namazTimeName_);
    }
    if (hour_ != 0) {
      output.writeInt32(3, hour_);
    }
    if (minute_ != 0) {
      output.writeInt32(4, minute_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuthData());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namazTimeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namazTimeName_);
    }
    if (hour_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hour_);
    }
    if (minute_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, minute_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mujeeb.mosquedashboard.grpc.NamazTime)) {
      return super.equals(obj);
    }
    com.mujeeb.mosquedashboard.grpc.NamazTime other = (com.mujeeb.mosquedashboard.grpc.NamazTime) obj;

    if (hasAuthData() != other.hasAuthData()) return false;
    if (hasAuthData()) {
      if (!getAuthData()
          .equals(other.getAuthData())) return false;
    }
    if (!getNamazTimeName()
        .equals(other.getNamazTimeName())) return false;
    if (getHour()
        != other.getHour()) return false;
    if (getMinute()
        != other.getMinute()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @SuppressWarnings("unchecked")
@java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAuthData()) {
      hash = (37 * hash) + AUTHDATA_FIELD_NUMBER;
      hash = (53 * hash) + getAuthData().hashCode();
    }
    hash = (37 * hash) + NAMAZTIMENAME_FIELD_NUMBER;
    hash = (53 * hash) + getNamazTimeName().hashCode();
    hash = (37 * hash) + HOUR_FIELD_NUMBER;
    hash = (53 * hash) + getHour();
    hash = (37 * hash) + MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + getMinute();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mujeeb.mosquedashboard.grpc.NamazTime parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mujeeb.mosquedashboard.grpc.NamazTime prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request Beans
   * </pre>
   *
   * Protobuf type {@code com.mujeeb.mosquedashboard.grpc.NamazTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.mujeeb.mosquedashboard.grpc.NamazTime)
      com.mujeeb.mosquedashboard.grpc.NamazTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mujeeb.mosquedashboard.grpc.MosqueDashboardProto.internal_static_com_mujeeb_mosquedashboard_grpc_NamazTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mujeeb.mosquedashboard.grpc.MosqueDashboardProto.internal_static_com_mujeeb_mosquedashboard_grpc_NamazTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mujeeb.mosquedashboard.grpc.NamazTime.class, com.mujeeb.mosquedashboard.grpc.NamazTime.Builder.class);
    }

    // Construct using com.mujeeb.mosquedashboard.grpc.NamazTime.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (authDataBuilder_ == null) {
        authData_ = null;
      } else {
        authData_ = null;
        authDataBuilder_ = null;
      }
      namazTimeName_ = "";

      hour_ = 0;

      minute_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mujeeb.mosquedashboard.grpc.MosqueDashboardProto.internal_static_com_mujeeb_mosquedashboard_grpc_NamazTime_descriptor;
    }

    @java.lang.Override
    public com.mujeeb.mosquedashboard.grpc.NamazTime getDefaultInstanceForType() {
      return com.mujeeb.mosquedashboard.grpc.NamazTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.mujeeb.mosquedashboard.grpc.NamazTime build() {
      com.mujeeb.mosquedashboard.grpc.NamazTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mujeeb.mosquedashboard.grpc.NamazTime buildPartial() {
      com.mujeeb.mosquedashboard.grpc.NamazTime result = new com.mujeeb.mosquedashboard.grpc.NamazTime(this);
      if (authDataBuilder_ == null) {
        result.authData_ = authData_;
      } else {
        result.authData_ = authDataBuilder_.build();
      }
      result.namazTimeName_ = namazTimeName_;
      result.hour_ = hour_;
      result.minute_ = minute_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mujeeb.mosquedashboard.grpc.NamazTime) {
        return mergeFrom((com.mujeeb.mosquedashboard.grpc.NamazTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mujeeb.mosquedashboard.grpc.NamazTime other) {
      if (other == com.mujeeb.mosquedashboard.grpc.NamazTime.getDefaultInstance()) return this;
      if (other.hasAuthData()) {
        mergeAuthData(other.getAuthData());
      }
      if (!other.getNamazTimeName().isEmpty()) {
        namazTimeName_ = other.namazTimeName_;
        onChanged();
      }
      if (other.getHour() != 0) {
        setHour(other.getHour());
      }
      if (other.getMinute() != 0) {
        setMinute(other.getMinute());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mujeeb.mosquedashboard.grpc.NamazTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mujeeb.mosquedashboard.grpc.NamazTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.mujeeb.mosquedashboard.grpc.AuthData authData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mujeeb.mosquedashboard.grpc.AuthData, com.mujeeb.mosquedashboard.grpc.AuthData.Builder, com.mujeeb.mosquedashboard.grpc.AuthDataOrBuilder> authDataBuilder_;
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     * @return Whether the authData field is set.
     */
    public boolean hasAuthData() {
      return authDataBuilder_ != null || authData_ != null;
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     * @return The authData.
     */
    public com.mujeeb.mosquedashboard.grpc.AuthData getAuthData() {
      if (authDataBuilder_ == null) {
        return authData_ == null ? com.mujeeb.mosquedashboard.grpc.AuthData.getDefaultInstance() : authData_;
      } else {
        return authDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public Builder setAuthData(com.mujeeb.mosquedashboard.grpc.AuthData value) {
      if (authDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authData_ = value;
        onChanged();
      } else {
        authDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public Builder setAuthData(
        com.mujeeb.mosquedashboard.grpc.AuthData.Builder builderForValue) {
      if (authDataBuilder_ == null) {
        authData_ = builderForValue.build();
        onChanged();
      } else {
        authDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public Builder mergeAuthData(com.mujeeb.mosquedashboard.grpc.AuthData value) {
      if (authDataBuilder_ == null) {
        if (authData_ != null) {
          authData_ =
            com.mujeeb.mosquedashboard.grpc.AuthData.newBuilder(authData_).mergeFrom(value).buildPartial();
        } else {
          authData_ = value;
        }
        onChanged();
      } else {
        authDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public Builder clearAuthData() {
      if (authDataBuilder_ == null) {
        authData_ = null;
        onChanged();
      } else {
        authData_ = null;
        authDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public com.mujeeb.mosquedashboard.grpc.AuthData.Builder getAuthDataBuilder() {
      
      onChanged();
      return getAuthDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    public com.mujeeb.mosquedashboard.grpc.AuthDataOrBuilder getAuthDataOrBuilder() {
      if (authDataBuilder_ != null) {
        return authDataBuilder_.getMessageOrBuilder();
      } else {
        return authData_ == null ?
            com.mujeeb.mosquedashboard.grpc.AuthData.getDefaultInstance() : authData_;
      }
    }
    /**
     * <code>.com.mujeeb.mosquedashboard.grpc.AuthData authData = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mujeeb.mosquedashboard.grpc.AuthData, com.mujeeb.mosquedashboard.grpc.AuthData.Builder, com.mujeeb.mosquedashboard.grpc.AuthDataOrBuilder> 
        getAuthDataFieldBuilder() {
      if (authDataBuilder_ == null) {
        authDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mujeeb.mosquedashboard.grpc.AuthData, com.mujeeb.mosquedashboard.grpc.AuthData.Builder, com.mujeeb.mosquedashboard.grpc.AuthDataOrBuilder>(
                getAuthData(),
                getParentForChildren(),
                isClean());
        authData_ = null;
      }
      return authDataBuilder_;
    }

    private java.lang.Object namazTimeName_ = "";
    /**
     * <code>string namazTimeName = 2;</code>
     * @return The namazTimeName.
     */
    public java.lang.String getNamazTimeName() {
      java.lang.Object ref = namazTimeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namazTimeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namazTimeName = 2;</code>
     * @return The bytes for namazTimeName.
     */
    public com.google.protobuf.ByteString
        getNamazTimeNameBytes() {
      java.lang.Object ref = namazTimeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namazTimeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namazTimeName = 2;</code>
     * @param value The namazTimeName to set.
     * @return This builder for chaining.
     */
    public Builder setNamazTimeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namazTimeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namazTimeName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamazTimeName() {
      
      namazTimeName_ = getDefaultInstance().getNamazTimeName();
      onChanged();
      return this;
    }
    /**
     * <code>string namazTimeName = 2;</code>
     * @param value The bytes for namazTimeName to set.
     * @return This builder for chaining.
     */
    public Builder setNamazTimeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namazTimeName_ = value;
      onChanged();
      return this;
    }

    private int hour_ ;
    /**
     * <code>int32 hour = 3;</code>
     * @return The hour.
     */
    @java.lang.Override
    public int getHour() {
      return hour_;
    }
    /**
     * <code>int32 hour = 3;</code>
     * @param value The hour to set.
     * @return This builder for chaining.
     */
    public Builder setHour(int value) {
      
      hour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hour = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHour() {
      
      hour_ = 0;
      onChanged();
      return this;
    }

    private int minute_ ;
    /**
     * <code>int32 minute = 4;</code>
     * @return The minute.
     */
    @java.lang.Override
    public int getMinute() {
      return minute_;
    }
    /**
     * <code>int32 minute = 4;</code>
     * @param value The minute to set.
     * @return This builder for chaining.
     */
    public Builder setMinute(int value) {
      
      minute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 minute = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinute() {
      
      minute_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.mujeeb.mosquedashboard.grpc.NamazTime)
  }

  // @@protoc_insertion_point(class_scope:com.mujeeb.mosquedashboard.grpc.NamazTime)
  private static final com.mujeeb.mosquedashboard.grpc.NamazTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mujeeb.mosquedashboard.grpc.NamazTime();
  }

  public static com.mujeeb.mosquedashboard.grpc.NamazTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamazTime>
      PARSER = new com.google.protobuf.AbstractParser<NamazTime>() {
    @java.lang.Override
    public NamazTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NamazTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NamazTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamazTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mujeeb.mosquedashboard.grpc.NamazTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

