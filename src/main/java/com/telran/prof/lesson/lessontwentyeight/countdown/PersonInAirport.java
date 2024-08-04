package com.telran.prof.lesson.lessontwentyeight.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class PersonInAirport implements Runnable {

    private final String name;

    private final CountDownLatch countDownLatch;

    public PersonInAirport(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("-> " + name + " go to airport");
            System.out.println("[!] " + name + " pass control");
            System.out.println("[!] " + name + " take a lunch");

            //оповестил что готов и уменьшил счетчик на 1
            countDownLatch.countDown(); // dec 1

            System.out.println();
            // и пошел ждать до тех пор, пока счетчик не будет равен 0
            countDownLatch.await(25, TimeUnit.SECONDS);

            //Код, который будет выполнен после того как счетчик станет равен 0

            System.out.println("[!] " + name + "go to plane");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}