package com.telran.prof.homeworkjava.homeworkone.task1;

public class Person {
    private String name;
    private String fullName;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Person() {

    }
    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void printPersonInfo(){
        System.out.println("Name = "+ name);
        System.out.println("Full name = " + fullName);
        System.out.println("Age = " + age);
    }

    public void move(){
        System.out.println("идет");
    }
    public void talk(){
        System.out.println("говорит");
    }

}
