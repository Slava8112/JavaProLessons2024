package com.telran.prof.lesson.lessontwentyfour;

public class MthExampleOne {
    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread().getName());
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        //SomeClass extends Thread
        //override run() method
        //написать внутри метода run() код который должен выполняться в отдельном потоке
        //create new object of SomeClass
        //call method start()

        System.out.println();
        for (int i = 0;i < 10;i++){
            new ThreadOne().start();
        }
        System.out.println();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();



    }
}
