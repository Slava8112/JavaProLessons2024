package com.telran.prof.lesson.lessontwentysix.incorrect;

import static com.telran.prof.lesson.lessontwentyfive.ExampleFour.counter;

public class Runner implements Runnable {

    @Override
    // public synchronized void run() // - можно в сигнатуре метода
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 1000; i++) {
            //1 get
            //2 increase 1
            //3 set

            synchronized (this) { // можно окружить блок кода
                counter++;
                System.out.println("Thread " + name + " " + counter++);
            }


            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
