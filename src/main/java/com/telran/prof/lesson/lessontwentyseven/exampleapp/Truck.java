package com.telran.prof.lesson.lessontwentyseven.exampleapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Truck extends Thread {

    private Storage storage;

    public Truck(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            sleepNow(10000);
            int size = random.nextInt(50);
            List<Box> boxList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                boxList.add(new Box(random.nextInt()));
            }

            synchronized (storage) {
                storage.setBoxes(boxList);
                System.out.println("\nLoad to storage " + boxList.size() + " boxes\n");
                sleepNow(3000);
                storage.notify();
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
