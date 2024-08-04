package com.telran.prof.lesson.lessontwo.exone;

public class ExampleOne {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
        System.out.println();
        SmallDog smallDog = new SmallDog();
        smallDog.voice();
        smallDog.jump();
    }
}

