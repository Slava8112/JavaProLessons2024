package com.telran.prof.lesson.lessontwentyfive;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleFour {
    public static int counter = 0;

    public static AtomicInteger counterTwo = new AtomicInteger();

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        counterTwo.set(0);
        Thread threadOne = new Thread(new TestCounter());
        Thread threadTwo = new Thread(new TestCounter());
        Thread threadThree = new Thread(new TestCounter());

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();

        System.out.println("Counter = " + counter);
        System.out.println("List size = " + list.size());
        System.out.println("Counter two = " + counterTwo.get());
    }
}
