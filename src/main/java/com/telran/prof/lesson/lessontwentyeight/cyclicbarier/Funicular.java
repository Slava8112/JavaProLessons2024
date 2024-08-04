package com.telran.prof.lesson.lessontwentyeight.cyclicbarier;

public class Funicular implements Runnable{

    @Override
    public void run() {
        try {
            // Thread.sleep(10000);
            System.out.println("Funicular took some people and is going to the top of hill");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}