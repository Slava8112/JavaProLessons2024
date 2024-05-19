package com.telran.prof.lesson.lessonfour.exampleenum;

public class Operation {
    private  String name;
    private  OperationState state;

    public Operation(String name, OperationState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperationState getState() {
        return state;
    }

    public void setState(OperationState state) {
        this.state = state;
    }
}
