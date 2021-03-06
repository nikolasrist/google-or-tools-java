/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class IntVarIterator extends BaseObject {
  private transient long swigCPtr;

  protected IntVarIterator(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.IntVarIterator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVarIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_IntVarIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void Init() {
    operations_research_constraint_solverJNI.IntVarIterator_Init(swigCPtr, this);
  }

  public boolean Ok() {
    return operations_research_constraint_solverJNI.IntVarIterator_Ok(swigCPtr, this);
  }

  public long value() {
    return operations_research_constraint_solverJNI.IntVarIterator_value(swigCPtr, this);
  }

  public void Next() {
    operations_research_constraint_solverJNI.IntVarIterator_Next(swigCPtr, this);
  }

  public String toString() {
    return operations_research_constraint_solverJNI.IntVarIterator_toString(swigCPtr, this);
  }

}
