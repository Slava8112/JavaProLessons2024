package com.telran.prof.lesson.lessonfour.exampleenum;

public class OperationApp {
    public static void main(String[] args) {
        Operation opOne = new Operation("do homework",OperationState.NEW);
        Operation opTwo = new Operation("check homework",OperationState.COMPLETED);
        printAllCompletedOperation(opOne,opTwo);
        printAllCompletedOperation(opTwo);
//        Operation[] operations = {opOne,opTwo};

    }
    private static void printAllCompletedOperation(Operation...operations){
        for (Operation operation : operations){
            if (OperationState.COMPLETED == operation.getState()){
                System.out.println("Operation is " + operation.getName() + " " + operation.getState().getDescription());
            }
        }
    }
}
