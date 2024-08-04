package com.telran.prof.lesson.lessontwentyeight.cyclicbarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PersonInFunicular implements Runnable{

    private final String name;

    private final CyclicBarrier cyclicBarrier;

    public PersonInFunicular(String name, CyclicBarrier cyclicBarrier) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("-> " + name +" is waiting on platform");
        try {
            cyclicBarrier.await();
            System.out.println("<- " + name + " on the top");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
