// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.manju.pcbook;

public final class KeyboardMessage {
  private KeyboardMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_Keyboard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_Keyboard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026keyboard_message.proto\022\020com.manju.pcbo" +
      "ok\"\211\001\n\010Keyboard\0221\n\006layout\030\001 \001(\0162!.com.ma" +
      "nju.pcbook.Keyboard.Layout\022\017\n\007backlit\030\002 " +
      "\001(\010\"9\n\006Layout\022\013\n\007UNKNOWN\020\000\022\n\n\006QWERTY\020\001\022\n" +
      "\n\006QWERTZ\020\002\022\n\n\006AZERTY\020\003B\024\n\020com.manju.pcbo" +
      "okP\001b\006proto3"
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
        }, assigner);
    internal_static_com_manju_pcbook_Keyboard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_manju_pcbook_Keyboard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_Keyboard_descriptor,
        new java.lang.String[] { "Layout", "Backlit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}