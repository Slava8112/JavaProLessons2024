package com.telran.prof.lesson.lessonfourteenth;

public interface CustomFunctionalInt {
    void accept();

    default void print() {
        System.out.println("Hello");
    }

    static void printTwo() {
        System.out.println("HelloTwo");
    }
}
