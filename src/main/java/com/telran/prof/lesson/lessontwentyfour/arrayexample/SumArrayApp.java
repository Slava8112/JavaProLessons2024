package com.telran.prof.lesson.lessontwentyfour.arrayexample;

import java.util.Arrays;
import java.util.Random;

public class SumArrayApp {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for(int i = 0; i < 10000 ; i++) {
            array[i] = random.nextInt(200);
        }

        Counter counter = new Counter();
        long startTime = System.currentTimeMillis();
        counter.countSum(array);
        System.out.println("It takes " + (System.currentTimeMillis() - startTime));
    }
}
