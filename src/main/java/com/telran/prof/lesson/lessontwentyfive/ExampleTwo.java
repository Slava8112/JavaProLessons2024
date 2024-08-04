package com.telran.prof.lesson.lessontwentyfive;

public class ExampleTwo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread");

        Thread thread = new Thread(new TestThread());
        thread.start();

        Thread.sleep(133);

        thread.interrupt();  // Running - isInterrupted
        // sleep, wait - try-catch
    }
}
