package com.telran.prof.lesson.lessontwentyfour.arrayexample;

import java.util.Random;

public class SumArrayMth {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            array[i] = random.nextInt(200);
        }

        Counter counter = new Counter();
        long startTime = System.currentTimeMillis();
        counter.countSum(array);
        System.out.println("It takes in one thread  " + (System.currentTimeMillis() - startTime));

        int[] result = new int[4];
        MthCounter one = new MthCounter(array, 0, 2500, 0, result);
        MthCounter two = new MthCounter(array, 2500, 5000, 1, result);
        MthCounter three = new MthCounter(array, 5000, 7500, 2, result);
        MthCounter four = new MthCounter(array, 7500, 10000, 3, result);

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
        Thread threadThree = new Thread(three);
        Thread threadFour = new Thread(four);

        startTime = System.currentTimeMillis();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();
        System.out.println("It takes in 4 threads " + (System.currentTimeMillis() - startTime));

        int resultSum = 0;
        for(int el : result)
            resultSum += el;
        System.out.println("Result sum of array is " + resultSum);
    }
}
