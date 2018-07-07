/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.graph;

public class MaxFlow {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MaxFlow(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MaxFlow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_graphJNI.delete_MaxFlow(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MaxFlow() {
    this(operations_research_graphJNI.new_MaxFlow(), true);
  }

  public int addArcWithCapacity(int tail, int head, long capacity) {
    return operations_research_graphJNI.MaxFlow_addArcWithCapacity(swigCPtr, this, tail, head, capacity);
  }

  public int getNumNodes() {
    return operations_research_graphJNI.MaxFlow_getNumNodes(swigCPtr, this);
  }

  public int getNumArcs() {
    return operations_research_graphJNI.MaxFlow_getNumArcs(swigCPtr, this);
  }

  public int getTail(int arc) {
    return operations_research_graphJNI.MaxFlow_getTail(swigCPtr, this, arc);
  }

  public int getHead(int arc) {
    return operations_research_graphJNI.MaxFlow_getHead(swigCPtr, this, arc);
  }

  public long getCapacity(int arc) {
    return operations_research_graphJNI.MaxFlow_getCapacity(swigCPtr, this, arc);
  }

  public MaxFlow.Status solve(int source, int sink) {
    return MaxFlow.Status.swigToEnum(operations_research_graphJNI.MaxFlow_solve(swigCPtr, this, source, sink));
  }

  public long getOptimalFlow() {
    return operations_research_graphJNI.MaxFlow_getOptimalFlow(swigCPtr, this);
  }

  public long getFlow(int arc) {
    return operations_research_graphJNI.MaxFlow_getFlow(swigCPtr, this, arc);
  }

  public void getSourceSideMinCut(SWIGTYPE_p_std__vectorT_int_t result) {
    operations_research_graphJNI.MaxFlow_getSourceSideMinCut(swigCPtr, this, SWIGTYPE_p_std__vectorT_int_t.getCPtr(result));
  }

  public void getSinkSideMinCut(SWIGTYPE_p_std__vectorT_int_t result) {
    operations_research_graphJNI.MaxFlow_getSinkSideMinCut(swigCPtr, this, SWIGTYPE_p_std__vectorT_int_t.getCPtr(result));
  }

  public void setArcCapacity(int arc, long capacity) {
    operations_research_graphJNI.MaxFlow_setArcCapacity(swigCPtr, this, arc, capacity);
  }

  public final static class Status {
    public final static MaxFlow.Status OPTIMAL = new MaxFlow.Status("OPTIMAL");
    public final static MaxFlow.Status POSSIBLE_OVERFLOW = new MaxFlow.Status("POSSIBLE_OVERFLOW");
    public final static MaxFlow.Status BAD_INPUT = new MaxFlow.Status("BAD_INPUT");
    public final static MaxFlow.Status BAD_RESULT = new MaxFlow.Status("BAD_RESULT");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Status swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    private Status(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Status(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Status(String swigName, Status swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Status[] swigValues = { OPTIMAL, POSSIBLE_OVERFLOW, BAD_INPUT, BAD_RESULT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}