package com.telran.prof.lesson.lessontwentyfive;

public class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start thread " + Thread.currentThread().getName());
        long j = 0;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Current status interrupted  -  "
                    + Thread.currentThread().isInterrupted());
            for(int i =0 ;i < 1000000000000L; i++) {
                j += i;
            }
            try {
                Thread.sleep(133);
            } catch (InterruptedException e) {
                System.out.println("I got interruption. End thread");
                return;
            }
        }

        System.out.println("End thread " + Thread.currentThread().getName());
    }
}
