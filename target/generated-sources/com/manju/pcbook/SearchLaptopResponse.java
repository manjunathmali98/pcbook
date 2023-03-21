// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.manju.pcbook;

/**
 * Protobuf type {@code com.manju.pcbook.SearchLaptopResponse}
 */
public  final class SearchLaptopResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.manju.pcbook.SearchLaptopResponse)
    SearchLaptopResponseOrBuilder {
  // Use SearchLaptopResponse.newBuilder() to construct.
  private SearchLaptopResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchLaptopResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SearchLaptopResponse(
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
            com.manju.pcbook.Laptop.Builder subBuilder = null;
            if (laptop_ != null) {
              subBuilder = laptop_.toBuilder();
            }
            laptop_ = input.readMessage(com.manju.pcbook.Laptop.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(laptop_);
              laptop_ = subBuilder.buildPartial();
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
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.manju.pcbook.LaptopServiceOuterClass.internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.manju.pcbook.LaptopServiceOuterClass.internal_static_com_manju_pcbook_SearchLaptopResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.manju.pcbook.SearchLaptopResponse.class, com.manju.pcbook.SearchLaptopResponse.Builder.class);
  }

  public static final int LAPTOP_FIELD_NUMBER = 1;
  private com.manju.pcbook.Laptop laptop_;
  /**
   * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
   */
  public boolean hasLaptop() {
    return laptop_ != null;
  }
  /**
   * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
   */
  public com.manju.pcbook.Laptop getLaptop() {
    return laptop_ == null ? com.manju.pcbook.Laptop.getDefaultInstance() : laptop_;
  }
  /**
   * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
   */
  public com.manju.pcbook.LaptopOrBuilder getLaptopOrBuilder() {
    return getLaptop();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (laptop_ != null) {
      output.writeMessage(1, getLaptop());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (laptop_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLaptop());
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
    if (!(obj instanceof com.manju.pcbook.SearchLaptopResponse)) {
      return super.equals(obj);
    }
    com.manju.pcbook.SearchLaptopResponse other = (com.manju.pcbook.SearchLaptopResponse) obj;

    boolean result = true;
    result = result && (hasLaptop() == other.hasLaptop());
    if (hasLaptop()) {
      result = result && getLaptop()
          .equals(other.getLaptop());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasLaptop()) {
      hash = (37 * hash) + LAPTOP_FIELD_NUMBER;
      hash = (53 * hash) + getLaptop().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.SearchLaptopResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.manju.pcbook.SearchLaptopResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.manju.pcbook.SearchLaptopResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.manju.pcbook.SearchLaptopResponse)
      com.manju.pcbook.SearchLaptopResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.manju.pcbook.LaptopServiceOuterClass.internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.manju.pcbook.LaptopServiceOuterClass.internal_static_com_manju_pcbook_SearchLaptopResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.manju.pcbook.SearchLaptopResponse.class, com.manju.pcbook.SearchLaptopResponse.Builder.class);
    }

    // Construct using com.manju.pcbook.SearchLaptopResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (laptopBuilder_ == null) {
        laptop_ = null;
      } else {
        laptop_ = null;
        laptopBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.manju.pcbook.LaptopServiceOuterClass.internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor;
    }

    public com.manju.pcbook.SearchLaptopResponse getDefaultInstanceForType() {
      return com.manju.pcbook.SearchLaptopResponse.getDefaultInstance();
    }

    public com.manju.pcbook.SearchLaptopResponse build() {
      com.manju.pcbook.SearchLaptopResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.manju.pcbook.SearchLaptopResponse buildPartial() {
      com.manju.pcbook.SearchLaptopResponse result = new com.manju.pcbook.SearchLaptopResponse(this);
      if (laptopBuilder_ == null) {
        result.laptop_ = laptop_;
      } else {
        result.laptop_ = laptopBuilder_.build();
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
      if (other instanceof com.manju.pcbook.SearchLaptopResponse) {
        return mergeFrom((com.manju.pcbook.SearchLaptopResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.manju.pcbook.SearchLaptopResponse other) {
      if (other == com.manju.pcbook.SearchLaptopResponse.getDefaultInstance()) return this;
      if (other.hasLaptop()) {
        mergeLaptop(other.getLaptop());
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
      com.manju.pcbook.SearchLaptopResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.manju.pcbook.SearchLaptopResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.manju.pcbook.Laptop laptop_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.manju.pcbook.Laptop, com.manju.pcbook.Laptop.Builder, com.manju.pcbook.LaptopOrBuilder> laptopBuilder_;
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public boolean hasLaptop() {
      return laptopBuilder_ != null || laptop_ != null;
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public com.manju.pcbook.Laptop getLaptop() {
      if (laptopBuilder_ == null) {
        return laptop_ == null ? com.manju.pcbook.Laptop.getDefaultInstance() : laptop_;
      } else {
        return laptopBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public Builder setLaptop(com.manju.pcbook.Laptop value) {
      if (laptopBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        laptop_ = value;
        onChanged();
      } else {
        laptopBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public Builder setLaptop(
        com.manju.pcbook.Laptop.Builder builderForValue) {
      if (laptopBuilder_ == null) {
        laptop_ = builderForValue.build();
        onChanged();
      } else {
        laptopBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public Builder mergeLaptop(com.manju.pcbook.Laptop value) {
      if (laptopBuilder_ == null) {
        if (laptop_ != null) {
          laptop_ =
            com.manju.pcbook.Laptop.newBuilder(laptop_).mergeFrom(value).buildPartial();
        } else {
          laptop_ = value;
        }
        onChanged();
      } else {
        laptopBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public Builder clearLaptop() {
      if (laptopBuilder_ == null) {
        laptop_ = null;
        onChanged();
      } else {
        laptop_ = null;
        laptopBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public com.manju.pcbook.Laptop.Builder getLaptopBuilder() {
      
      onChanged();
      return getLaptopFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    public com.manju.pcbook.LaptopOrBuilder getLaptopOrBuilder() {
      if (laptopBuilder_ != null) {
        return laptopBuilder_.getMessageOrBuilder();
      } else {
        return laptop_ == null ?
            com.manju.pcbook.Laptop.getDefaultInstance() : laptop_;
      }
    }
    /**
     * <code>optional .com.manju.pcbook.Laptop laptop = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.manju.pcbook.Laptop, com.manju.pcbook.Laptop.Builder, com.manju.pcbook.LaptopOrBuilder> 
        getLaptopFieldBuilder() {
      if (laptopBuilder_ == null) {
        laptopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.manju.pcbook.Laptop, com.manju.pcbook.Laptop.Builder, com.manju.pcbook.LaptopOrBuilder>(
                getLaptop(),
                getParentForChildren(),
                isClean());
        laptop_ = null;
      }
      return laptopBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.manju.pcbook.SearchLaptopResponse)
  }

  // @@protoc_insertion_point(class_scope:com.manju.pcbook.SearchLaptopResponse)
  private static final com.manju.pcbook.SearchLaptopResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.manju.pcbook.SearchLaptopResponse();
  }

  public static com.manju.pcbook.SearchLaptopResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchLaptopResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchLaptopResponse>() {
    public SearchLaptopResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SearchLaptopResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchLaptopResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchLaptopResponse> getParserForType() {
    return PARSER;
  }

  public com.manju.pcbook.SearchLaptopResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

