package com.telran.prof.lesson.lessontwentynineth.app;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SummatorExample {

    public static void main(String[] args) {
        int[] ints = new int[40000];
        Random random = new Random();
        for (int i = 0; i < 40000; i++) {
            ints[i] = random.nextInt(100);
        }
        long start = System.currentTimeMillis();
        System.out.println("Start dummy count : ");
        new DummySummator(ints).sum();
        System.out.println("End dummy summator " + (System.currentTimeMillis() - start));


        System.out.println("Start in pool count");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        start = System.currentTimeMillis();
        List<Future<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i <= 30000; i = i + 10000) {
            resultList.add(executorService.submit(new Summator(ints, i, i + 10000)));
        }

        try {
            int sum = 0;
            for (Future<Integer> result : resultList) {
                sum += result.get();
            }
            System.out.println("End in pool summator " + (System.currentTimeMillis() - start));
            System.out.println("Result from pool " + sum);

        } catch (Exception e) {
            System.out.println("Problem with " + e.getMessage());
        }
        executorService.shutdown();
    }
}