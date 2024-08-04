package com.telran.prof.lesson.lessontwentyfour;

public class ThreadSix implements Runnable{

    private int randomCounter;

    public ThreadSix(int randomCounter) {
        this.randomCounter = randomCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10;i++){
            System.out.println("I am thread "+ Thread.currentThread().getName() + " iteration = " + i);
            try {
                Thread.sleep(randomCounter * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
