package com.telran.prof.lesson.lessontwentynineth.mapexample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapApp {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cm = new ConcurrentHashMap<>();
        Map<String, Integer> hm = new HashMap<>();
        Map<String, Integer> sm = Collections.synchronizedMap(hm);
        //ArrayBlockingQueue
        //CopyOnWriteArrayList
        //CopyOnWriteArraySet

        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);

        checkTime(cm, cd1,"cm");

        checkTime(sm, cd2,"sm");

        checkTime(hm, cd3,"hm");
    }

    private static void checkTime(Map<String, Integer> map, CountDownLatch cd, String name) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Random random = new Random();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000000; i++) {
                map.put(String.valueOf(i), random.nextInt(100));
                map.get(String.valueOf(i));
            }
            cd.countDown();
        };
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            executorService.execute(runnable);
        }

        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Full time " + name +" " +(System.currentTimeMillis() - start));
        executorService.shutdown();

    }

}
