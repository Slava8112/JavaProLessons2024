package com.telran.prof.lesson.lessontwentynineth.app;

import java.util.concurrent.Callable;


public class Summator implements Callable<Integer> {

    private final int[] array;
    private final int start;
    private final int end;

    public Summator(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
