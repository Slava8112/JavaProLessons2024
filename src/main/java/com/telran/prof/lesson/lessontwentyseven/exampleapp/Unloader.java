package com.telran.prof.lesson.lessontwentyseven.exampleapp;

import java.util.List;

public class Unloader extends Thread {

    private Storage storage;

    public Unloader(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {

            synchronized (storage) {
                if (storage.getBoxes().size() > 0 ) {
//                    if (storage.getBoxes().size() > 20) {
//                        storage.notify();
//                    }
                    List<Box> boxes = storage.getBoxes();
                    Box box = boxes.get(0);
                    System.out.println("I am " + name + " get box  " + box );
                    boxes.remove(0);
                } else {
                    try {
                        System.out.println("I am " + name + " go to wait");
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            sleepNow(200);
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
