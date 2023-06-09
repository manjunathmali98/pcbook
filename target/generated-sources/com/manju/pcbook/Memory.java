// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.manju.pcbook;

/**
 * Protobuf type {@code com.manju.pcbook.Memory}
 */
public  final class Memory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.manju.pcbook.Memory)
    MemoryOrBuilder {
  // Use Memory.newBuilder() to construct.
  private Memory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Memory() {
    value_ = 0L;
    unit_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Memory(
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
          case 8: {

            value_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            unit_ = rawValue;
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
    return com.manju.pcbook.MemoryMessage.internal_static_com_manju_pcbook_Memory_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.manju.pcbook.MemoryMessage.internal_static_com_manju_pcbook_Memory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.manju.pcbook.Memory.class, com.manju.pcbook.Memory.Builder.class);
  }

  /**
   * Protobuf enum {@code com.manju.pcbook.Memory.Unit}
   */
  public enum Unit
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>BIT = 1;</code>
     */
    BIT(1),
    /**
     * <code>BYTE = 2;</code>
     */
    BYTE(2),
    /**
     * <code>KILOBYTE = 3;</code>
     */
    KILOBYTE(3),
    /**
     * <code>MEGABYTE = 4;</code>
     */
    MEGABYTE(4),
    /**
     * <code>GIGABYTE = 5;</code>
     */
    GIGABYTE(5),
    /**
     * <code>TERABYTE = 6;</code>
     */
    TERABYTE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>BIT = 1;</code>
     */
    public static final int BIT_VALUE = 1;
    /**
     * <code>BYTE = 2;</code>
     */
    public static final int BYTE_VALUE = 2;
    /**
     * <code>KILOBYTE = 3;</code>
     */
    public static final int KILOBYTE_VALUE = 3;
    /**
     * <code>MEGABYTE = 4;</code>
     */
    public static final int MEGABYTE_VALUE = 4;
    /**
     * <code>GIGABYTE = 5;</code>
     */
    public static final int GIGABYTE_VALUE = 5;
    /**
     * <code>TERABYTE = 6;</code>
     */
    public static final int TERABYTE_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Unit valueOf(int value) {
      return forNumber(value);
    }

    public static Unit forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return BIT;
        case 2: return BYTE;
        case 3: return KILOBYTE;
        case 4: return MEGABYTE;
        case 5: return GIGABYTE;
        case 6: return TERABYTE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unit>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unit> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unit>() {
            public Unit findValueByNumber(int number) {
              return Unit.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.manju.pcbook.Memory.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unit[] VALUES = values();

    public static Unit valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Unit(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.manju.pcbook.Memory.Unit)
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  /**
   * <code>optional uint64 value = 1;</code>
   */
  public long getValue() {
    return value_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private int unit_;
  /**
   * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
   */
  public com.manju.pcbook.Memory.Unit getUnit() {
    com.manju.pcbook.Memory.Unit result = com.manju.pcbook.Memory.Unit.valueOf(unit_);
    return result == null ? com.manju.pcbook.Memory.Unit.UNRECOGNIZED : result;
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
    if (value_ != 0L) {
      output.writeUInt64(1, value_);
    }
    if (unit_ != com.manju.pcbook.Memory.Unit.UNKNOWN.getNumber()) {
      output.writeEnum(2, unit_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, value_);
    }
    if (unit_ != com.manju.pcbook.Memory.Unit.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unit_);
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
    if (!(obj instanceof com.manju.pcbook.Memory)) {
      return super.equals(obj);
    }
    com.manju.pcbook.Memory other = (com.manju.pcbook.Memory) obj;

    boolean result = true;
    result = result && (getValue()
        == other.getValue());
    result = result && unit_ == other.unit_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.manju.pcbook.Memory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.Memory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.Memory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.manju.pcbook.Memory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.manju.pcbook.Memory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.Memory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.Memory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.Memory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.manju.pcbook.Memory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.manju.pcbook.Memory parseFrom(
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
  public static Builder newBuilder(com.manju.pcbook.Memory prototype) {
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
   * Protobuf type {@code com.manju.pcbook.Memory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.manju.pcbook.Memory)
      com.manju.pcbook.MemoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.manju.pcbook.MemoryMessage.internal_static_com_manju_pcbook_Memory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.manju.pcbook.MemoryMessage.internal_static_com_manju_pcbook_Memory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.manju.pcbook.Memory.class, com.manju.pcbook.Memory.Builder.class);
    }

    // Construct using com.manju.pcbook.Memory.newBuilder()
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
      value_ = 0L;

      unit_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.manju.pcbook.MemoryMessage.internal_static_com_manju_pcbook_Memory_descriptor;
    }

    public com.manju.pcbook.Memory getDefaultInstanceForType() {
      return com.manju.pcbook.Memory.getDefaultInstance();
    }

    public com.manju.pcbook.Memory build() {
      com.manju.pcbook.Memory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.manju.pcbook.Memory buildPartial() {
      com.manju.pcbook.Memory result = new com.manju.pcbook.Memory(this);
      result.value_ = value_;
      result.unit_ = unit_;
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
      if (other instanceof com.manju.pcbook.Memory) {
        return mergeFrom((com.manju.pcbook.Memory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.manju.pcbook.Memory other) {
      if (other == com.manju.pcbook.Memory.getDefaultInstance()) return this;
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
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
      com.manju.pcbook.Memory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.manju.pcbook.Memory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long value_ ;
    /**
     * <code>optional uint64 value = 1;</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <code>optional uint64 value = 1;</code>
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
     */
    public com.manju.pcbook.Memory.Unit getUnit() {
      com.manju.pcbook.Memory.Unit result = com.manju.pcbook.Memory.Unit.valueOf(unit_);
      return result == null ? com.manju.pcbook.Memory.Unit.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
     */
    public Builder setUnit(com.manju.pcbook.Memory.Unit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.manju.pcbook.Memory.Unit unit = 2;</code>
     */
    public Builder clearUnit() {
      
      unit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.manju.pcbook.Memory)
  }

  // @@protoc_insertion_point(class_scope:com.manju.pcbook.Memory)
  private static final com.manju.pcbook.Memory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.manju.pcbook.Memory();
  }

  public static com.manju.pcbook.Memory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Memory>
      PARSER = new com.google.protobuf.AbstractParser<Memory>() {
    public Memory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Memory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Memory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Memory> getParserForType() {
    return PARSER;
  }

  public com.manju.pcbook.Memory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

