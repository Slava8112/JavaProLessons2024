package com.telran.prof.lesson.lessonfour.exampleenum;

public enum OperationState {
    NEW("This is new operation"),
    TERMINATED("This operation was cancelled"),
    COMPLETED("This operation was completed");

    private String description;

    OperationState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
