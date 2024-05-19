package com.telran.prof.lesson.lessonthree.exampleabstract;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("animal eat!");
    }

    public String getName() {
        return name;
    }

    abstract void born();
}
