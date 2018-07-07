// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/routing_enums.proto

package com.google.ortools.constraintsolver;

public final class RoutingEnums {
  private RoutingEnums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_operations_research_FirstSolutionStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-ortools/constraint_solver/routing_enum" +
      "s.proto\022\023operations_research\"\336\002\n\025FirstSo" +
      "lutionStrategy\"\304\002\n\005Value\022\r\n\tAUTOMATIC\020\000\022" +
      "\025\n\021PATH_CHEAPEST_ARC\020\003\022\035\n\031PATH_MOST_CONS" +
      "TRAINED_ARC\020\004\022\026\n\022EVALUATOR_STRATEGY\020\005\022\013\n" +
      "\007SAVINGS\020\n\022\t\n\005SWEEP\020\013\022\020\n\014CHRISTOFIDES\020\r\022" +
      "\023\n\017ALL_UNPERFORMED\020\006\022\022\n\016BEST_INSERTION\020\007" +
      "\022\037\n\033PARALLEL_CHEAPEST_INSERTION\020\010\022\034\n\030LOC" +
      "AL_CHEAPEST_INSERTION\020\t\022\027\n\023GLOBAL_CHEAPE" +
      "ST_ARC\020\001\022\026\n\022LOCAL_CHEAPEST_ARC\020\002\022\033\n\027FIRS" +
      "T_UNBOUND_MIN_VALUE\020\014\"\245\001\n\030LocalSearchMet" +
      "aheuristic\"\210\001\n\005Value\022\r\n\tAUTOMATIC\020\000\022\022\n\016G" +
      "REEDY_DESCENT\020\001\022\027\n\023GUIDED_LOCAL_SEARCH\020\002" +
      "\022\027\n\023SIMULATED_ANNEALING\020\003\022\017\n\013TABU_SEARCH" +
      "\020\004\022\031\n\025OBJECTIVE_TABU_SEARCH\020\005BI\n#com.goo" +
      "gle.ortools.constraintsolverP\001\252\002\037Google." +
      "OrTools.ConstraintSolverb\006proto3"
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
    internal_static_operations_research_FirstSolutionStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_operations_research_FirstSolutionStrategy_descriptor,
        new java.lang.String[] { });
    internal_static_operations_research_LocalSearchMetaheuristic_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_operations_research_LocalSearchMetaheuristic_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}