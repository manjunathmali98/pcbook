// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.manju.pcbook;

public interface GPUOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.manju.pcbook.GPU)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string brand = 1;</code>
   */
  java.lang.String getBrand();
  /**
   * <code>optional string brand = 1;</code>
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional double min_ghz = 3;</code>
   */
  double getMinGhz();

  /**
   * <code>optional double max_ghz = 4;</code>
   */
  double getMaxGhz();

  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  boolean hasMemory();
  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  com.manju.pcbook.Memory getMemory();
  /**
   * <code>optional .com.manju.pcbook.Memory memory = 5;</code>
   */
  com.manju.pcbook.MemoryOrBuilder getMemoryOrBuilder();
}
