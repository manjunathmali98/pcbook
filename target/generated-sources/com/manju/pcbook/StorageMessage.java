// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage_message.proto

package com.manju.pcbook;

public final class StorageMessage {
  private StorageMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_Storage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_Storage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025storage_message.proto\022\020com.manju.pcboo" +
      "k\032\024memory_message.proto\"\216\001\n\007Storage\0220\n\006d" +
      "river\030\001 \001(\0162 .com.manju.pcbook.Storage.D" +
      "river\022(\n\006memory\030\002 \001(\0132\030.com.manju.pcbook" +
      ".Memory\"\'\n\006Driver\022\013\n\007UNKNOWN\020\000\022\007\n\003HDD\020\001\022" +
      "\007\n\003SSD\020\002B\024\n\020com.manju.pcbookP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.manju.pcbook.MemoryMessage.getDescriptor(),
        }, assigner);
    internal_static_com_manju_pcbook_Storage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_manju_pcbook_Storage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_Storage_descriptor,
        new java.lang.String[] { "Driver", "Memory", });
    com.manju.pcbook.MemoryMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
