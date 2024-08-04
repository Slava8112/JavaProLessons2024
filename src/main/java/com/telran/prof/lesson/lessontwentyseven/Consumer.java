package com.telran.prof.lesson.lessontwentyseven;

import java.util.List;

public class Consumer extends Thread{
    private List<String> strings;

    public Consumer(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (strings) {
                if(strings.size()>0) {
                    String s = strings.get(0);
                    System.out.println("Object from list =" + s);
                    strings.remove(0);
                    System.out.println("Size of list = " + strings.size());
                } else {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
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
