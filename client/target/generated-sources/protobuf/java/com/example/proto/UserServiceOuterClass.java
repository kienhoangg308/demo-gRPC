// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.example.proto;

public final class UserServiceOuterClass {
  private UserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_proto_UserDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_proto_UserDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_proto_UsersDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_proto_UsersDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_proto_EmptyDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_proto_EmptyDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_proto_UserNameDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_proto_UserNameDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_service.proto\022\021com.example.proto\"" +
      "#\n\007UserDto\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\"5\n\010" +
      "UsersDto\022)\n\005users\030\001 \003(\0132\032.com.example.pr" +
      "oto.UserDto\"\n\n\010EmptyDto\"\033\n\013UserNameDto\022\014" +
      "\n\004name\030\001 \001(\t2\244\002\n\013UserService\022C\n\007FindAll\022" +
      "\033.com.example.proto.EmptyDto\032\033.com.examp" +
      "le.proto.UsersDto\022H\n\nFindByName\022\036.com.ex" +
      "ample.proto.UserNameDto\032\032.com.example.pr" +
      "oto.UserDto\022?\n\004Save\022\032.com.example.proto." +
      "UserDto\032\033.com.example.proto.EmptyDto\022E\n\006",
      "Delete\022\036.com.example.proto.UserNameDto\032\033" +
      ".com.example.proto.EmptyDtoB\002P\001b\006proto3"
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
    internal_static_com_example_proto_UserDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_proto_UserDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_proto_UserDto_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_com_example_proto_UsersDto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_proto_UsersDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_proto_UsersDto_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_com_example_proto_EmptyDto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_proto_EmptyDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_proto_EmptyDto_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_proto_UserNameDto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_proto_UserNameDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_proto_UserNameDto_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}