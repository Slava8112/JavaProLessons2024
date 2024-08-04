package com.telran.prof.lesson.lessontwentyfour;

public class MthExampleFour {
    public static void main(String[] args) throws InterruptedException{
//        Thread.sleep(5000);
        System.out.println("Start method main in thread " + Thread.currentThread().getName());
//        new ThreadFour().run();

        new Thread(new ThreadFour()).start();


        System.out.println("End Method main in thread " + Thread.currentThread().getName());


    }
}
