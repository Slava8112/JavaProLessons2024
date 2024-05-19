package com.telran.prof.lesson.lessonten.selfWork;

import com.telran.prof.lesson.lessonten.Cat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExampleThree {

    public static void main(String[] args) {
        Cat catOne = new Cat("Mursik",10);
        Cat catTwo = new Cat("Barsik", 15);
        Cat catThree = new Cat("Felix", 5);

        Set<Cat> cats = new HashSet<>();
        cats.add(catOne);
        cats.add(catTwo);
        cats.add(catThree);

        System.out.println("Cats contains catTwo = " + cats.contains(catTwo));

        System.out.println("\nSearch from list : ");
        List<Cat> list = Arrays.asList(catOne,catThree,catTwo);
        list.contains(catTwo);
    }
}
