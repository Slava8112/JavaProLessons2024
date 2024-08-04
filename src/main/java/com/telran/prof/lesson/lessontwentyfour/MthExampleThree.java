package com.telran.prof.lesson.lessontwentyfour;

public class MthExampleThree {
    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread().getName());

        Thread one = new Thread(){
            @Override
            public void run(){
                System.out.println("Sub  thread main" + Thread.currentThread().getName());

            }
        };
        one.start();

        Runnable two = () -> System.out.println("Sub  thread main" + Thread.currentThread().getName());
        new Thread(two).start();
    }
}
