package com.telran.prof.lesson.lessontwentyfour;

public class ThreadFour implements Runnable{
    @Override
    public void run() {
        System.out.println("Start method run from sub thread " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("End method run from sub thread " + Thread.currentThread().getName());
    }
}
