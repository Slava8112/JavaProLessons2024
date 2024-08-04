package com.telran.prof.lesson.lessontwentynineth;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuildingAppTwo {

    public static void main(String[] args) {
        String[] stages = {"1.Project", "2.Start", "3.Finish", "4.Approve"};

        CountDownLatch cd1 = new CountDownLatch(stages.length);
        CountDownLatch cd2 = new CountDownLatch(stages.length);
        CountDownLatch cd3 = new CountDownLatch(stages.length);
        CountDownLatch cd4 = new CountDownLatch(stages.length);

        ExecutorService es = Executors.newFixedThreadPool(4);

        System.out.println("Start thread");

        es.execute(new Building("Dusseldorf", cd1, stages));
        es.execute(new Building("Cologne", cd2, stages));
        es.execute(new Building("Dortmund", cd3, stages));
        es.execute(new Building("Essen", cd4, stages));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Threads are end");
    }
}

