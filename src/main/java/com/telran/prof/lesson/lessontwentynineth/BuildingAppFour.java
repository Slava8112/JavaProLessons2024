package com.telran.prof.lesson.lessontwentynineth;

import java.util.concurrent.*;

public class BuildingAppFour {
    public static void main(String[] args) {

        String[] stages = {"1.Project", "2.Start", "3.Finish", "4.Approve"};

        CountDownLatch cd1 = new CountDownLatch(stages.length);
        CountDownLatch cd2 = new CountDownLatch(stages.length);
        CountDownLatch cd3 = new CountDownLatch(stages.length);
        CountDownLatch cd4 = new CountDownLatch(stages.length);

       ScheduledExecutorService es =  Executors.newScheduledThreadPool(3);

        System.out.println("Start thread");

        es.schedule(new Building("Dusseldorf",cd1,stages),3, TimeUnit.SECONDS);
        es.schedule(new Building("Cologne",cd2,stages),5,TimeUnit.SECONDS);
        es.schedule(new Building("Dortmund",cd3,stages),10, TimeUnit.SECONDS);
        es.schedule(new Building("Essen",cd4,stages),15, TimeUnit.SECONDS);

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Threads are end");
    }
}

