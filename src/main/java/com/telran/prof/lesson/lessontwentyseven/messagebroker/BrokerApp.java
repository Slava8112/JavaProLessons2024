package com.telran.prof.lesson.lessontwentyseven.messagebroker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BrokerApp {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Thread producer = new Thread(new Producer(queue));
        producer.start();

        Thread consumer = new Thread(new Consumer(queue));
        consumer.start();

        System.out.println("Producer and Consumer has been started");

        Thread.sleep(10000);

        System.out.println("Producer in status " + producer.getState());

        //List<String> strings = new ArrayList<>();
        //String s1 = strings.stream().filter(s -> s.startsWith("K")).findFirst()
        //.get();
        //.orElse("Hello");
    }
}
