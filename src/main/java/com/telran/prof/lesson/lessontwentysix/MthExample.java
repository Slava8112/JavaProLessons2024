package com.telran.prof.lesson.lessontwentysix;

public class MthExample {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        // Object object = new Object();
        Runnable runnable = new Runnable() {

            //synchronized in method signature - говорит о том, что данный метод
            //может выполняться только одним потоков в один момент времени
            //если в этот же момент другие потоки пожелают его выполнить
            //то они будут ждать пока закончит работу уже работающий поток
            @Override
            // public synchronized void run() // - можно в сигнатуре метода
            // public synchronized void run()  === synchronized (this) - this!!!!!
            public void run() {
                String name = Thread.currentThread().getName();

                for (int i = 0; i < 1000; i++) {
                    //1 get
                    //2 increase 1
                    //3 set

                    //Mutex (simple ~ boolean)
                    //Monitor - механизм работы с мьютекс
                    //Когда поток достигает блока или метода synchronized
                    //он проверяет состояние мьютекса у этого объекта
                    //и если мьютекс свободен, то поток заходит внутрь блока synchronized
                    //и отмечает мьютекс как занят
                    //если мьютекс объекта занят, то поток переходит в состояние ожидания
                    synchronized (this) { // можно окружить блок кода
                        counter++;
                        System.out.println("Thread " + name + " " + counter);
                    }
                    //После завершения работы с блоком synchronized мьютекс
                    //освобождается и другой поток может работать с блоком synchronized
                    //этого объекта

//                    synchronized (object) {
//                        object.getClass();
//                    }


                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        };

        //Runnable  || for (1||2||3)  , synchronized 2->1->3 - continue for (2||3||1)

        Thread one = new Thread(runnable); //synchronized (runnable) - runnable
        Thread two = new Thread(runnable); // synchronized (runnable) - runnable
        Thread three = new Thread(runnable); // synchronized (runnable) - runnable

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