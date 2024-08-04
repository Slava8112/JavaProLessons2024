package com.telran.prof.lesson.lessontwentynineth.app;

public class DummySummator {

    private final int[] array;


    public DummySummator(int[] array) {
        this.array = array;
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum from dummy summator : " + sum);
    }
}
