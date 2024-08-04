package com.telran.prof.lesson.lessontwentyfour.hippodrom;

import java.time.LocalTime;

public class Horse implements Runnable{
    private  String name;

    private  int step;

    private int loopLength;

    private int currentPosition = 0;

    public Horse(String name, int step, int loopLength) {
        this.name = name;
        this.step = step + 1;
        this.loopLength = loopLength;
    }

    @Override
    public void run() {
        while (currentPosition < loopLength){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPosition += step;
            System.out.println("Horse " + name + " step by " + currentPosition);
        }
        System.out.println("I am " + name + " finish time "+ LocalTime.now());
    }
}
