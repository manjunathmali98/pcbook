// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.manju.pcbook;

/**
 * Protobuf type {@code com.manju.pcbook.GPU}
 */
public  final class GPU extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.manju.pcbook.GPU)
    GPUOrBuilder {
  // Use GPU.newBuilder() to construct.
  private GPU(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GPU() {
    brand_ = "";
    name_ = "";
    minGhz_ = 0D;
    maxGhz_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GPU(
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

            brand_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 25: {

            minGhz_ = input.readDouble();
            break;
          }
          case 33: {

            maxGhz_ = input.readDouble();
            break;
          }
          case 42: {
            com.manju.pcbook.Memory.Builder subBuilder = null;
            if (memory_ != null) {
              subBuilder = memory_.toBuilder();
            }
            memory_ = input.readMessage(com.manju.pcbook.Memory.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(memory_);
              memory_ = subBuilder.buildPartial();
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
    return com.manju.pcbook.ProcessorMessage.internal_static_com_manju_pcbook_GPU_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.manju.pcbook.ProcessorMessage.internal_static_com_manju_pcbook_GPU_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.manju.pcbook.GPU.class, com.manju.pcbook.GPU.Builder.class);
  }

  public static final int BRAND_FIELD_NUMBER = 1;
  private volatile java.lang.Object brand_;
  /**
   * <code>optional string brand = 1;</code>
   */
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>optional string brand = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_GHZ_FIELD_NUMBER = 3;
  private double minGhz_;
  /**
   * <code>optional double min_ghz = 3;</code>
   */
  public double getMinGhz() {
    return minGhz_;
  }

  public static final int MAX_GHZ_FIELD_NUMBER = 4;
  private double maxGhz_;
  /**
   * <code>optional double max_ghz = 4;</code>
   */
  public double getMaxGhz() {
    return maxGhz_;
  }

  public static final int MEMORY_FIELD_NUMBER = 5;
  private com.manju.pcbook.Memory memory_;
  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  public boolean hasMemory() {
    return memory_ != null;
  }
  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  public com.manju.pcbook.Memory getMemory() {
    return memory_ == null ? com.manju.pcbook.Memory.getDefaultInstance() : memory_;
  }
  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  public com.manju.pcbook.MemoryOrBuilder getMemoryOrBuilder() {
    return getMemory();
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
    if (!getBrandBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brand_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (minGhz_ != 0D) {
      output.writeDouble(3, minGhz_);
    }
    if (maxGhz_ != 0D) {
      output.writeDouble(4, maxGhz_);
    }
    if (memory_ != null) {
      output.writeMessage(5, getMemory());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBrandBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brand_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (minGhz_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, minGhz_);
    }
    if (maxGhz_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, maxGhz_);
    }
    if (memory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMemory());
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
    if (!(obj instanceof com.manju.pcbook.GPU)) {
      return super.equals(obj);
    }
    com.manju.pcbook.GPU other = (com.manju.pcbook.GPU) obj;

    boolean result = true;
    result = result && getBrand()
        .equals(other.getBrand());
    result = result && getName()
        .equals(other.getName());
    result = result && (
        java.lang.Double.doubleToLongBits(getMinGhz())
        == java.lang.Double.doubleToLongBits(
            other.getMinGhz()));
    result = result && (
        java.lang.Double.doubleToLongBits(getMaxGhz())
        == java.lang.Double.doubleToLongBits(
            other.getMaxGhz()));
    result = result && (hasMemory() == other.hasMemory());
    if (hasMemory()) {
      result = result && getMemory()
          .equals(other.getMemory());
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
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MIN_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinGhz()));
    hash = (37 * hash) + MAX_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxGhz()));
    if (hasMemory()) {
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.manju.pcbook.GPU parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.GPU parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.GPU parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.GPU parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.GPU parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.GPU parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.GPU parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.GPU parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.GPU parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.GPU parseFrom(
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
  public static Builder newBuilder(com.manju.pcbook.GPU prototype) {
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
   * Protobuf type {@code com.manju.pcbook.GPU}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.manju.pcbook.GPU)
      com.manju.pcbook.GPUOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.manju.pcbook.ProcessorMessage.internal_static_com_manju_pcbook_GPU_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.manju.pcbook.ProcessorMessage.internal_static_com_manju_pcbook_GPU_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.manju.pcbook.GPU.class, com.manju.pcbook.GPU.Builder.class);
    }

    // Construct using com.manju.pcbook.GPU.newBuilder()
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
      brand_ = "";

      name_ = "";

      minGhz_ = 0D;

      maxGhz_ = 0D;

      if (memoryBuilder_ == null) {
        memory_ = null;
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.manju.pcbook.ProcessorMessage.internal_static_com_manju_pcbook_GPU_descriptor;
    }

    public com.manju.pcbook.GPU getDefaultInstanceForType() {
      return com.manju.pcbook.GPU.getDefaultInstance();
    }

    public com.manju.pcbook.GPU build() {
      com.manju.pcbook.GPU result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.manju.pcbook.GPU buildPartial() {
      com.manju.pcbook.GPU result = new com.manju.pcbook.GPU(this);
      result.brand_ = brand_;
      result.name_ = name_;
      result.minGhz_ = minGhz_;
      result.maxGhz_ = maxGhz_;
      if (memoryBuilder_ == null) {
        result.memory_ = memory_;
      } else {
        result.memory_ = memoryBuilder_.build();
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
      if (other instanceof com.manju.pcbook.GPU) {
        return mergeFrom((com.manju.pcbook.GPU)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.manju.pcbook.GPU other) {
      if (other == com.manju.pcbook.GPU.getDefaultInstance()) return this;
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getMinGhz() != 0D) {
        setMinGhz(other.getMinGhz());
      }
      if (other.getMaxGhz() != 0D) {
        setMaxGhz(other.getMaxGhz());
      }
      if (other.hasMemory()) {
        mergeMemory(other.getMemory());
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
      com.manju.pcbook.GPU parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.manju.pcbook.GPU) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>optional string brand = 1;</code>
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string brand = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string brand = 1;</code>
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string brand = 1;</code>
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>optional string brand = 1;</code>
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private double minGhz_ ;
    /**
     * <code>optional double min_ghz = 3;</code>
     */
    public double getMinGhz() {
      return minGhz_;
    }
    /**
     * <code>optional double min_ghz = 3;</code>
     */
    public Builder setMinGhz(double value) {
      
      minGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double min_ghz = 3;</code>
     */
    public Builder clearMinGhz() {
      
      minGhz_ = 0D;
      onChanged();
      return this;
    }

    private double maxGhz_ ;
    /**
     * <code>optional double max_ghz = 4;</code>
     */
    public double getMaxGhz() {
      return maxGhz_;
    }
    /**
     * <code>optional double max_ghz = 4;</code>
     */
    public Builder setMaxGhz(double value) {
      
      maxGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double max_ghz = 4;</code>
     */
    public Builder clearMaxGhz() {
      
      maxGhz_ = 0D;
      onChanged();
      return this;
    }

    private com.manju.pcbook.Memory memory_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.manju.pcbook.Memory, com.manju.pcbook.Memory.Builder, com.manju.pcbook.MemoryOrBuilder> memoryBuilder_;
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public boolean hasMemory() {
      return memoryBuilder_ != null || memory_ != null;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public com.manju.pcbook.Memory getMemory() {
      if (memoryBuilder_ == null) {
        return memory_ == null ? com.manju.pcbook.Memory.getDefaultInstance() : memory_;
      } else {
        return memoryBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public Builder setMemory(com.manju.pcbook.Memory value) {
      if (memoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        memory_ = value;
        onChanged();
      } else {
        memoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public Builder setMemory(
        com.manju.pcbook.Memory.Builder builderForValue) {
      if (memoryBuilder_ == null) {
        memory_ = builderForValue.build();
        onChanged();
      } else {
        memoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public Builder mergeMemory(com.manju.pcbook.Memory value) {
      if (memoryBuilder_ == null) {
        if (memory_ != null) {
          memory_ =
            com.manju.pcbook.Memory.newBuilder(memory_).mergeFrom(value).buildPartial();
        } else {
          memory_ = value;
        }
        onChanged();
      } else {
        memoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public Builder clearMemory() {
      if (memoryBuilder_ == null) {
        memory_ = null;
        onChanged();
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public com.manju.pcbook.Memory.Builder getMemoryBuilder() {
      
      onChanged();
      return getMemoryFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    public com.manju.pcbook.MemoryOrBuilder getMemoryOrBuilder() {
      if (memoryBuilder_ != null) {
        return memoryBuilder_.getMessageOrBuilder();
      } else {
        return memory_ == null ?
            com.manju.pcbook.Memory.getDefaultInstance() : memory_;
      }
    }
    /**
     * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.manju.pcbook.Memory, com.manju.pcbook.Memory.Builder, com.manju.pcbook.MemoryOrBuilder> 
        getMemoryFieldBuilder() {
      if (memoryBuilder_ == null) {
        memoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.manju.pcbook.Memory, com.manju.pcbook.Memory.Builder, com.manju.pcbook.MemoryOrBuilder>(
                getMemory(),
                getParentForChildren(),
                isClean());
        memory_ = null;
      }
      return memoryBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.manju.pcbook.GPU)
  }

  // @@protoc_insertion_point(class_scope:com.manju.pcbook.GPU)
  private static final com.manju.pcbook.GPU DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.manju.pcbook.GPU();
  }

  public static com.manju.pcbook.GPU getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPU>
      PARSER = new com.google.protobuf.AbstractParser<GPU>() {
    public GPU parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GPU(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GPU> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPU> getParserForType() {
    return PARSER;
  }

  public com.manju.pcbook.GPU getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

