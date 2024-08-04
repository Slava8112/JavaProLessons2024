package com.telran.prof.lesson.lessontwentyeight.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangeApp {
    public static void main(String[] args) throws InterruptedException {

        /*

        A               B
                E
        C               D

        Track1
        A->C, A->D       A->D, B->D

        Track2
        B->C, B->D       B->C, A->C

         */

        String[] parcelOne = {"parcel A->D", "parcel A->C"};
        String[] parcelTwo = {"parcel B->C", "parcel B->D"};

        Exchanger<String> exchanger = new Exchanger<>();

        //Start truck on from A to D
        new Thread(new Truck(1, "A", "D", parcelOne, exchanger)).start();

        Thread.sleep(100);

        //Start truck from B to C
        new Thread(new Truck(2, "B", "C", parcelTwo, exchanger)).start();
    }
}


