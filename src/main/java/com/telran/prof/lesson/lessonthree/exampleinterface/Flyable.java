package com.telran.prof.lesson.lessonthree.exampleinterface;

//interface - это полностью абстрактный класс
public interface Flyable {

    String FLY_NAME = "Name";

    void fly();

    default void prepareToFly() {
        System.out.println("Prepare to fly");
    }
}
