// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.example.proto;

/**
 * Protobuf type {@code com.example.proto.UsersDto}
 */
public  final class UsersDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.proto.UsersDto)
    UsersDtoOrBuilder {
  // Use UsersDto.newBuilder() to construct.
  private UsersDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsersDto() {
    users_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UsersDto(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              users_ = new java.util.ArrayList<com.example.proto.UserDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            users_.add(
                input.readMessage(com.example.proto.UserDto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        users_ = java.util.Collections.unmodifiableList(users_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.proto.UserServiceOuterClass.internal_static_com_example_proto_UsersDto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.proto.UserServiceOuterClass.internal_static_com_example_proto_UsersDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.proto.UsersDto.class, com.example.proto.UsersDto.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  private java.util.List<com.example.proto.UserDto> users_;
  /**
   * <code>repeated .com.example.proto.UserDto users = 1;</code>
   */
  public java.util.List<com.example.proto.UserDto> getUsersList() {
    return users_;
  }
  /**
   * <code>repeated .com.example.proto.UserDto users = 1;</code>
   */
  public java.util.List<? extends com.example.proto.UserDtoOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <code>repeated .com.example.proto.UserDto users = 1;</code>
   */
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated .com.example.proto.UserDto users = 1;</code>
   */
  public com.example.proto.UserDto getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated .com.example.proto.UserDto users = 1;</code>
   */
  public com.example.proto.UserDtoOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
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
    if (!(obj instanceof com.example.proto.UsersDto)) {
      return super.equals(obj);
    }
    com.example.proto.UsersDto other = (com.example.proto.UsersDto) obj;

    boolean result = true;
    result = result && getUsersList()
        .equals(other.getUsersList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.proto.UsersDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.proto.UsersDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.proto.UsersDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.proto.UsersDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.proto.UsersDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.proto.UsersDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.proto.UsersDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.proto.UsersDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.proto.UsersDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.proto.UsersDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.proto.UsersDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.proto.UsersDto parseFrom(
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
  public static Builder newBuilder(com.example.proto.UsersDto prototype) {
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
   * Protobuf type {@code com.example.proto.UsersDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.proto.UsersDto)
      com.example.proto.UsersDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.proto.UserServiceOuterClass.internal_static_com_example_proto_UsersDto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.proto.UserServiceOuterClass.internal_static_com_example_proto_UsersDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.proto.UsersDto.class, com.example.proto.UsersDto.Builder.class);
    }

    // Construct using com.example.proto.UsersDto.newBuilder()
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
        getUsersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        usersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.proto.UserServiceOuterClass.internal_static_com_example_proto_UsersDto_descriptor;
    }

    public com.example.proto.UsersDto getDefaultInstanceForType() {
      return com.example.proto.UsersDto.getDefaultInstance();
    }

    public com.example.proto.UsersDto build() {
      com.example.proto.UsersDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.proto.UsersDto buildPartial() {
      com.example.proto.UsersDto result = new com.example.proto.UsersDto(this);
      int from_bitField0_ = bitField0_;
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
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
      if (other instanceof com.example.proto.UsersDto) {
        return mergeFrom((com.example.proto.UsersDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.proto.UsersDto other) {
      if (other == com.example.proto.UsersDto.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
          }
        }
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
      com.example.proto.UsersDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.proto.UsersDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.proto.UserDto> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        users_ = new java.util.ArrayList<com.example.proto.UserDto>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.proto.UserDto, com.example.proto.UserDto.Builder, com.example.proto.UserDtoOrBuilder> usersBuilder_;

    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public java.util.List<com.example.proto.UserDto> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public com.example.proto.UserDto getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder setUsers(
        int index, com.example.proto.UserDto value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder setUsers(
        int index, com.example.proto.UserDto.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder addUsers(com.example.proto.UserDto value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder addUsers(
        int index, com.example.proto.UserDto value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder addUsers(
        com.example.proto.UserDto.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder addUsers(
        int index, com.example.proto.UserDto.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends com.example.proto.UserDto> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public com.example.proto.UserDto.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public com.example.proto.UserDtoOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public java.util.List<? extends com.example.proto.UserDtoOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public com.example.proto.UserDto.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          com.example.proto.UserDto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public com.example.proto.UserDto.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, com.example.proto.UserDto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.proto.UserDto users = 1;</code>
     */
    public java.util.List<com.example.proto.UserDto.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.proto.UserDto, com.example.proto.UserDto.Builder, com.example.proto.UserDtoOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.proto.UserDto, com.example.proto.UserDto.Builder, com.example.proto.UserDtoOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.proto.UsersDto)
  }

  // @@protoc_insertion_point(class_scope:com.example.proto.UsersDto)
  private static final com.example.proto.UsersDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.proto.UsersDto();
  }

  public static com.example.proto.UsersDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsersDto>
      PARSER = new com.google.protobuf.AbstractParser<UsersDto>() {
    public UsersDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UsersDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UsersDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsersDto> getParserForType() {
    return PARSER;
  }

  public com.example.proto.UsersDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

