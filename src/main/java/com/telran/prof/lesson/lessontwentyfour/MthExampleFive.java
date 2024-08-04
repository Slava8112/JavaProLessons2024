package com.telran.prof.lesson.lessontwentyfour;

public class MthExampleFive {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread");

        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Run sub thread "+ name);
          for (int i = 0;i <10; i ++){
              System.out.println("Run in sub thread "+ name + " " + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
            System.out.println("End sub thread " + name);
        };
        new Thread(runnable).start();

        Thread.sleep(4000);

        System.out.println("End main thread");
    }
}
