package com.telran.prof.lesson.lessontwentyeight.semaphore;

import java.util.concurrent.Semaphore;

public class Person implements Runnable {

    private final String name;
    private final Semaphore semaphore;
    private final boolean[] freeTables;

    public Person(String name, Semaphore semaphore, boolean[] freeTables) {
        this.name = name;
        this.semaphore = semaphore;
        this.freeTables = freeTables;
    }

    @Override
    public void run() {
        System.out.println("->" + name + " go to restaurant");
        int tableNumber = -1;
        try {
            // if count == 0 ; thread go to wait
            //Запрашиваю доступ искать свободный стол
            semaphore.acquire(); // dec 1, go  //4 // 3 // 2// 1 // 0 //
            //Доступ получен, шатаюсь по залу и точно найду свободный стол

            //если мы тут, то свободные столы точно есть
            //semaphore.acquire(3);

            synchronized (freeTables) {
                for (int i = 0; i < 5; i++) {

                    // !(freeTable[i] = false) == true

                    if (freeTables[i] == false) {
                        freeTables[i] = true;
                        tableNumber = i;
                        System.out.println("[!]" + name + "occupied " + (i + 1));
                        break;
                    }
                }
            }


            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Освободил стол и шатаясь иду к выходу
        synchronized (freeTables) {
            freeTables[tableNumber] = false;
        }

        //Говорю на выходе я все, можете пускать другого
        semaphore.release(); // inc 1, go  // 1 //2
        //semaphore.release(5);

        //Ухожу
        synchronized (freeTables) {
            System.out.println("<- " + name + " finished and go to home");
            System.out.println("[!] " + (tableNumber + 1) + " is free");
        }
    }
}
