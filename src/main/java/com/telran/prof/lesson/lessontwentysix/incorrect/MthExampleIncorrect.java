package com.telran.prof.lesson.lessontwentysix.incorrect;

public class MthExampleIncorrect {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Runner runnerOne = new Runner(); //  runnerOne
        Runner runnerTwo = new Runner();
        Runner runnerThree = new Runner();

        //Runnable  || for (1||2||3)  , synchronized 2->1->3 - continue for (2||3||1)

        Thread one = new Thread(runnerOne); // synchronized (runnerOne) - runnerOne
        Thread two = new Thread(runnerTwo); // synchronized (runnerTwo) - runnerTwo
        Thread three = new Thread(runnerThree); // synchronized (runnerThree) - runnerThree

        one.start();
        two.start();
        three.start();

        //join - усыпляет поток в котором он вызван,
        //пока поток у которого вызван метод не завершит работу
        one.join();
        two.join();
        three.join();

        System.out.println("Counter = " + counter);

    }
}