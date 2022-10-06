package com.directi.training.ocp.exercise_refactored;

public interface Resource
{
    int findFree();
    void markResourceBusy(int resourceId);
    void markResourceFree(int resourceId);
}
