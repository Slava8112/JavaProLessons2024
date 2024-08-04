package com.telran.prof.lesson.lessontwentyseven.crossBow;

public class CrossBowApp {
    public static void main(String[] args) {
        CrossBow crossBow = new CrossBow();

        new Thread(crossBow::fire).start();
        new Thread(crossBow::reload).start();
    }
}
