package com.telran.prof.lesson.lessontwentyfour;

public class ThreadOne extends Thread{

    @Override
    public void run(){
        System.out.println("Sub  thread main" + Thread.currentThread().getName());

    }
}
