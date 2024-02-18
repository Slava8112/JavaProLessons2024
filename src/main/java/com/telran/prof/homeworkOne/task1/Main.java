package com.telran.prof.homeworkOne.task1;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Aleksander");
        personOne.setFullName("Petrov");
        personOne.setAge(35);

        Person personTwo = new Person("Oleg","Sumkin",25);

        personOne.printPersonInfo();
        System.out.println();
        personTwo.printPersonInfo();

        System.out.println();

        System.out.println(personOne.getFullName());
        personOne.move();

        System.out.println();

        System.out.println(personTwo.getFullName());
        personTwo.talk();
    }
}
