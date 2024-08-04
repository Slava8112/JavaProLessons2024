package com.telran.prof.lesson.lessontwentysix;

public class CustomSync implements Runnable {

    private Object monitor;

    public CustomSync(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

    }
}
