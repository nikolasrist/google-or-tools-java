// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/routing_enums.proto

package com.google.ortools.constraintsolver;

/**
 * <pre>
 * Local search metaheuristics used to guide the search. Apart from greedy
 * descent, they will try to escape local minima.
 * </pre>
 *
 * Protobuf type {@code operations_research.LocalSearchMetaheuristic}
 */
public  final class LocalSearchMetaheuristic extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.LocalSearchMetaheuristic)
    LocalSearchMetaheuristicOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalSearchMetaheuristic.newBuilder() to construct.
  private LocalSearchMetaheuristic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalSearchMetaheuristic() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalSearchMetaheuristic(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.constraintsolver.LocalSearchMetaheuristic.class, com.google.ortools.constraintsolver.LocalSearchMetaheuristic.Builder.class);
  }

  /**
   * Protobuf enum {@code operations_research.LocalSearchMetaheuristic.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Lets the solver select the metaheuristic.
     * </pre>
     *
     * <code>AUTOMATIC = 0;</code>
     */
    AUTOMATIC(0),
    /**
     * <pre>
     * Accepts improving (cost-reducing) local search neighbors until a local
     * minimum is reached.
     * </pre>
     *
     * <code>GREEDY_DESCENT = 1;</code>
     */
    GREEDY_DESCENT(1),
    /**
     * <pre>
     * Uses guided local search to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Guided_Local_Search); this is generally
     * the most efficient metaheuristic for vehicle routing.
     * </pre>
     *
     * <code>GUIDED_LOCAL_SEARCH = 2;</code>
     */
    GUIDED_LOCAL_SEARCH(2),
    /**
     * <pre>
     * Uses simulated annealing to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Simulated_annealing).
     * </pre>
     *
     * <code>SIMULATED_ANNEALING = 3;</code>
     */
    SIMULATED_ANNEALING(3),
    /**
     * <pre>
     * Uses tabu search to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Tabu_search).
     * </pre>
     *
     * <code>TABU_SEARCH = 4;</code>
     */
    TABU_SEARCH(4),
    /**
     * <pre>
     * Uses tabu search on the objective value of solution to escape local
     * minima
     * </pre>
     *
     * <code>OBJECTIVE_TABU_SEARCH = 5;</code>
     */
    OBJECTIVE_TABU_SEARCH(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Lets the solver select the metaheuristic.
     * </pre>
     *
     * <code>AUTOMATIC = 0;</code>
     */
    public static final int AUTOMATIC_VALUE = 0;
    /**
     * <pre>
     * Accepts improving (cost-reducing) local search neighbors until a local
     * minimum is reached.
     * </pre>
     *
     * <code>GREEDY_DESCENT = 1;</code>
     */
    public static final int GREEDY_DESCENT_VALUE = 1;
    /**
     * <pre>
     * Uses guided local search to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Guided_Local_Search); this is generally
     * the most efficient metaheuristic for vehicle routing.
     * </pre>
     *
     * <code>GUIDED_LOCAL_SEARCH = 2;</code>
     */
    public static final int GUIDED_LOCAL_SEARCH_VALUE = 2;
    /**
     * <pre>
     * Uses simulated annealing to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Simulated_annealing).
     * </pre>
     *
     * <code>SIMULATED_ANNEALING = 3;</code>
     */
    public static final int SIMULATED_ANNEALING_VALUE = 3;
    /**
     * <pre>
     * Uses tabu search to escape local minima
     * (cf. http://en.wikipedia.org/wiki/Tabu_search).
     * </pre>
     *
     * <code>TABU_SEARCH = 4;</code>
     */
    public static final int TABU_SEARCH_VALUE = 4;
    /**
     * <pre>
     * Uses tabu search on the objective value of solution to escape local
     * minima
     * </pre>
     *
     * <code>OBJECTIVE_TABU_SEARCH = 5;</code>
     */
    public static final int OBJECTIVE_TABU_SEARCH_VALUE = 5;


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
    public static Value valueOf(int value) {
      return forNumber(value);
    }

    public static Value forNumber(int value) {
      switch (value) {
        case 0: return AUTOMATIC;
        case 1: return GREEDY_DESCENT;
        case 2: return GUIDED_LOCAL_SEARCH;
        case 3: return SIMULATED_ANNEALING;
        case 4: return TABU_SEARCH;
        case 5: return OBJECTIVE_TABU_SEARCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Value>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Value> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Value>() {
            public Value findValueByNumber(int number) {
              return Value.forNumber(number);
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
      return com.google.ortools.constraintsolver.LocalSearchMetaheuristic.getDescriptor().getEnumTypes().get(0);
    }

    private static final Value[] VALUES = values();

    public static Value valueOf(
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

    private Value(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:operations_research.LocalSearchMetaheuristic.Value)
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
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.constraintsolver.LocalSearchMetaheuristic)) {
      return super.equals(obj);
    }
    com.google.ortools.constraintsolver.LocalSearchMetaheuristic other = (com.google.ortools.constraintsolver.LocalSearchMetaheuristic) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic parseFrom(
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
  public static Builder newBuilder(com.google.ortools.constraintsolver.LocalSearchMetaheuristic prototype) {
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
   * <pre>
   * Local search metaheuristics used to guide the search. Apart from greedy
   * descent, they will try to escape local minima.
   * </pre>
   *
   * Protobuf type {@code operations_research.LocalSearchMetaheuristic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.LocalSearchMetaheuristic)
      com.google.ortools.constraintsolver.LocalSearchMetaheuristicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.constraintsolver.LocalSearchMetaheuristic.class, com.google.ortools.constraintsolver.LocalSearchMetaheuristic.Builder.class);
    }

    // Construct using com.google.ortools.constraintsolver.LocalSearchMetaheuristic.newBuilder()
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
    }

    public com.google.ortools.constraintsolver.LocalSearchMetaheuristic getDefaultInstanceForType() {
      return com.google.ortools.constraintsolver.LocalSearchMetaheuristic.getDefaultInstance();
    }

    public com.google.ortools.constraintsolver.LocalSearchMetaheuristic build() {
      com.google.ortools.constraintsolver.LocalSearchMetaheuristic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ortools.constraintsolver.LocalSearchMetaheuristic buildPartial() {
      com.google.ortools.constraintsolver.LocalSearchMetaheuristic result = new com.google.ortools.constraintsolver.LocalSearchMetaheuristic(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ortools.constraintsolver.LocalSearchMetaheuristic) {
        return mergeFrom((com.google.ortools.constraintsolver.LocalSearchMetaheuristic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.constraintsolver.LocalSearchMetaheuristic other) {
      if (other == com.google.ortools.constraintsolver.LocalSearchMetaheuristic.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ortools.constraintsolver.LocalSearchMetaheuristic parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.constraintsolver.LocalSearchMetaheuristic) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:operations_research.LocalSearchMetaheuristic)
  }

  // @@protoc_insertion_point(class_scope:operations_research.LocalSearchMetaheuristic)
  private static final com.google.ortools.constraintsolver.LocalSearchMetaheuristic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.constraintsolver.LocalSearchMetaheuristic();
  }

  public static com.google.ortools.constraintsolver.LocalSearchMetaheuristic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalSearchMetaheuristic>
      PARSER = new com.google.protobuf.AbstractParser<LocalSearchMetaheuristic>() {
    public LocalSearchMetaheuristic parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocalSearchMetaheuristic(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalSearchMetaheuristic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalSearchMetaheuristic> getParserForType() {
    return PARSER;
  }

  public com.google.ortools.constraintsolver.LocalSearchMetaheuristic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
