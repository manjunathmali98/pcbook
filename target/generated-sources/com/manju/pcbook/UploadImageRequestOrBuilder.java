// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.manju.pcbook;

public interface UploadImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.manju.pcbook.UploadImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.manju.pcbook.ImageInfo info = 1;</code>
   */
  com.manju.pcbook.ImageInfo getInfo();
  /**
   * <code>optional .com.manju.pcbook.ImageInfo info = 1;</code>
   */
  com.manju.pcbook.ImageInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>optional bytes chunk_data = 2;</code>
   */
  com.google.protobuf.ByteString getChunkData();

  public com.manju.pcbook.UploadImageRequest.DataCase getDataCase();
}
