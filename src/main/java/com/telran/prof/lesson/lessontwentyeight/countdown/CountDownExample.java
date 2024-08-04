package com.telran.prof.lesson.lessontwentyeight.countdown;

import java.util.concurrent.CountDownLatch;

public class CountDownExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(9);

        String[] names = {"Roman", "Alena", "Anna", "Kira", "Leo", "Bob", "Jack", "Inna"};

        for (String name : names) {
            new Thread(new PersonInAirport(name, countDownLatch)).start();
            Thread.sleep(700);
        }
    }
}
