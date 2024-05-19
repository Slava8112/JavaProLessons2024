package com.telran.prof.lesson.lessonfourteenth.basicfuncint;

import java.util.function.Supplier;

public class ExampleSupplier {

    public static void main(String[] args) {
        //Supplier - T get();

        Supplier<Double> randomValue = () -> Math.random();

        Supplier<Double> randomValueTwo = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());

        Supplier<User> userGenerator = () -> new User(String.valueOf(Math.random()),
                String.valueOf(Math.random()));

        System.out.println(userGenerator.get());
        System.out.println(userGenerator.get());
    }
}
