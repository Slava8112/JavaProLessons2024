package com.telran.prof.homeworkjava.homeworkone.task2;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void receiveCall(){
        System.out.println("Звонит Александр");
    }
    public void callingNumber(){
        getNumber();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                '}';
    }

}
