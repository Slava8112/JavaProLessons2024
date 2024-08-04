package com.telran.prof.lesson.lessontwentyfive;

public class ExampleThree {
    public static void main(String[] args) throws InterruptedException {
        Runnable one = () -> {
            while (true) {
                //
            }
        };


        Runnable two = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);

        threadOne.start();
        threadTwo.start();

        System.out.println("State one is " + threadOne.getState());
        System.out.println("State one is " + threadTwo.getState());

        Thread.sleep(12000);

        System.out.println("State one is " + threadOne.getState());
        System.out.println("State one is " + threadTwo.getState());

    }
}
