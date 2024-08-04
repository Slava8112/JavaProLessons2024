package com.telran.prof.lesson.lessontwentyseven.exampleapp;

import java.util.concurrent.atomic.AtomicInteger;

public class StorageApp {

    public static AtomicInteger currentIndex  = new AtomicInteger();

    public static void main(String[] args) {
        Storage storage = new Storage();
        currentIndex.set(0);

        for (int i = 0; i < 10; i++) {
            new Thread(new Unloader(storage)).start();
        }
        new Thread(new Truck(storage)).start();
    }
}
