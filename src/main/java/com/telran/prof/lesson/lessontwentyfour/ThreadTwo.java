package com.telran.prof.lesson.lessontwentyfour;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Sub  thread main" + Thread.currentThread().getName());
    }
}
