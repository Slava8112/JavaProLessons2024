package com.telran.prof.lesson.lessontwentynineth;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class Building implements Runnable{

    private final String city;

    private final CountDownLatch latch;

    private final String[] stages;

    public Building(String city, CountDownLatch latch, String[] stages) {
        this.city = city;
        this.latch = latch;
        this.stages = stages;
    }

    @Override
    public void run(){
        for (int i = 0;i < stages.length; i++){
        System.out.println(""
                + city
                + " "
                + stages[i]
                + ", "
                + Thread.currentThread().getName()
                + " " + new Date());
                latch.countDown();
        try {
            Thread.sleep((long)  (Math.random() *1500));
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
