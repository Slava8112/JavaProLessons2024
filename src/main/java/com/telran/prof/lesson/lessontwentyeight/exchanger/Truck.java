package com.telran.prof.lesson.lessontwentyeight.exchanger;

import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Truck implements Runnable {

    private final int number;
    private final String departure;
    private final String destination;
    private final String[] parcels;
    private final Exchanger<String> exchanger;

    public Truck(int number, String departure, String destination, String[] parcels, Exchanger<String> exchanger) {
        this.number = number;
        this.departure = departure;
        this.destination = destination;
        this.parcels = parcels;
        this.exchanger = exchanger;
    }


    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Truck with number " + number + " has parcels " + parcels[0] + " and " + parcels[1]);
        System.out.println("Truck with number " + number + "start from " + departure + " to " + destination);

        try {
            Thread.sleep(random.nextInt(5) * 1000L);
            System.out.println("Truck with number " + number + " stop in point E");

            //String parcel = exchanger.exchange(parcels[1]);
            String parcel = exchanger.exchange(parcels[1], 10L, TimeUnit.SECONDS);
            parcels[1] = parcel;

            System.out.println("Truck with number " + number + " get parcel for " + destination);
            Thread.sleep(random.nextInt(5) * 1000L);
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println("Truck with number " + number + " delivered parcels " + parcels[0] + " and " + parcels[1]);
    }
}
