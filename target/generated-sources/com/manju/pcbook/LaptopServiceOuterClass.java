// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.manju.pcbook;

public final class LaptopServiceOuterClass {
  private LaptopServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_CreateLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_CreateLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_CreateLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_CreateLaptopResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_SearchLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_SearchLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_SearchLaptopResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_UploadImageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_UploadImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_ImageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_ImageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_UploadImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_UploadImageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_RateLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_RateLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manju_pcbook_RateLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manju_pcbook_RateLaptopResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024laptop_service.proto\022\020com.manju.pcbook" +
      "\032\024laptop_message.proto\032\024filter_message.p" +
      "roto\"?\n\023CreateLaptopRequest\022(\n\006laptop\030\001 " +
      "\001(\0132\030.com.manju.pcbook.Laptop\"\"\n\024CreateL" +
      "aptopResponse\022\n\n\002id\030\001 \001(\t\"?\n\023SearchLapto" +
      "pRequest\022(\n\006filter\030\001 \001(\0132\030.com.manju.pcb" +
      "ook.Filter\"@\n\024SearchLaptopResponse\022(\n\006la" +
      "ptop\030\001 \001(\0132\030.com.manju.pcbook.Laptop\"_\n\022" +
      "UploadImageRequest\022+\n\004info\030\001 \001(\0132\033.com.m" +
      "anju.pcbook.ImageInfoH\000\022\024\n\nchunk_data\030\002 ",
      "\001(\014H\000B\006\n\004data\"2\n\tImageInfo\022\021\n\tlaptop_id\030" +
      "\001 \001(\t\022\022\n\nimage_type\030\002 \001(\t\"/\n\023UploadImage" +
      "Response\022\n\n\002id\030\001 \001(\t\022\014\n\004size\030\002 \001(\r\"5\n\021Ra" +
      "teLaptopRequest\022\021\n\tlaptop_id\030\001 \001(\t\022\r\n\005sc" +
      "ore\030\002 \001(\001\"S\n\022RateLaptopResponse\022\021\n\tlapto" +
      "p_id\030\001 \001(\t\022\023\n\013rated_count\030\002 \001(\r\022\025\n\ravera" +
      "ge_score\030\003 \001(\0012\222\003\n\rLaptopService\022_\n\014Crea" +
      "teLaptop\022%.com.manju.pcbook.CreateLaptop" +
      "Request\032&.com.manju.pcbook.CreateLaptopR" +
      "esponse\"\000\022a\n\014SearchLaptop\022%.com.manju.pc",
      "book.SearchLaptopRequest\032&.com.manju.pcb" +
      "ook.SearchLaptopResponse\"\0000\001\022^\n\013UploadIm" +
      "age\022$.com.manju.pcbook.UploadImageReques" +
      "t\032%.com.manju.pcbook.UploadImageResponse" +
      "\"\000(\001\022]\n\nRateLaptop\022#.com.manju.pcbook.Ra" +
      "teLaptopRequest\032$.com.manju.pcbook.RateL" +
      "aptopResponse\"\000(\0010\001B\024\n\020com.manju.pcbookP" +
      "\001b\006proto3"
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
          com.manju.pcbook.LaptopMessage.getDescriptor(),
          com.manju.pcbook.FilterMessage.getDescriptor(),
        }, assigner);
    internal_static_com_manju_pcbook_CreateLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_manju_pcbook_CreateLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_CreateLaptopRequest_descriptor,
        new java.lang.String[] { "Laptop", });
    internal_static_com_manju_pcbook_CreateLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_manju_pcbook_CreateLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_CreateLaptopResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_manju_pcbook_SearchLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_manju_pcbook_SearchLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_SearchLaptopRequest_descriptor,
        new java.lang.String[] { "Filter", });
    internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_manju_pcbook_SearchLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_SearchLaptopResponse_descriptor,
        new java.lang.String[] { "Laptop", });
    internal_static_com_manju_pcbook_UploadImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_manju_pcbook_UploadImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_UploadImageRequest_descriptor,
        new java.lang.String[] { "Info", "ChunkData", "Data", });
    internal_static_com_manju_pcbook_ImageInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_manju_pcbook_ImageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_ImageInfo_descriptor,
        new java.lang.String[] { "LaptopId", "ImageType", });
    internal_static_com_manju_pcbook_UploadImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_manju_pcbook_UploadImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_UploadImageResponse_descriptor,
        new java.lang.String[] { "Id", "Size", });
    internal_static_com_manju_pcbook_RateLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_manju_pcbook_RateLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_RateLaptopRequest_descriptor,
        new java.lang.String[] { "LaptopId", "Score", });
    internal_static_com_manju_pcbook_RateLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_manju_pcbook_RateLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manju_pcbook_RateLaptopResponse_descriptor,
        new java.lang.String[] { "LaptopId", "RatedCount", "AverageScore", });
    com.manju.pcbook.LaptopMessage.getDescriptor();
    com.manju.pcbook.FilterMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
