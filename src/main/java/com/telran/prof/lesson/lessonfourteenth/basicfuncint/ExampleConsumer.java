package com.telran.prof.lesson.lessonfourteenth.basicfuncint;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ExampleConsumer {

    public static void main(String[] args) {
        //Принимает только один аргумент, ничего не возвращает
        //Consumer -> accept(T t);
        Consumer<String> upperPrinter = s -> System.out.println(s.toUpperCase());
        upperPrinter.accept("hEllo");

        BiConsumer<String, String> concatPrinter = (s1, s2) -> {
            System.out.println("S1 = " + s1);
            System.out.println("S2 = " + s2);
            System.out.println("" + s1 + " " + s2);
        };
        concatPrinter.accept("Hello", "World");

        Consumer<List<Integer>> multiply = list -> list.forEach(value -> System.out.print((value * 2)+" "));
        List<Integer> integerList = Arrays.asList(5, 6, 3, 2, 6);
        multiply.accept(integerList);
        //IntConsumer , LongConsumer, DoubleConsumer
    }
}