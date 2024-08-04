package com.telran.prof.lesson.lessontwentyseven.messagebroker;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            while (true) {

                System.out.println("Consumed " + queue.take().getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
