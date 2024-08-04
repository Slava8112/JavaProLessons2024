package com.telran.prof.lesson.lessontwentyfive;

public class TestCounter implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 100;i ++){
            ExampleFour.counter ++;
            ExampleFour.counterTwo.getAndIncrement();
            System.out.println("Thread " + Thread.currentThread().getName() + " " + ExampleFour.counter);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ExampleFour.list.add(i);
        }
    }
}
