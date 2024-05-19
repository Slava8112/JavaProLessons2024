package com.telran.prof.lesson.lessonthree.exampleabstract;

public class Cow extends HomeAnimal {

    public Cow(String name) {
        super(name);
    }

    public void produceMilk() {
        //
    }

    @Override
    public void born() {
        System.out.println("Cow is born!");
    }

    @Override
    void humanCare() {
        System.out.println("Cow human care!!!");
    }
}
