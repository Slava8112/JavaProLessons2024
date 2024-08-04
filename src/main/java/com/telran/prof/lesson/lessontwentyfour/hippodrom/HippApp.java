package com.telran.prof.lesson.lessontwentyfour.hippodrom;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HippApp {
    public static void main(String[] args) {
        int loopLength = 1000;
        Random random = new Random();
        List<Horse> horses = Arrays.asList(
                new Horse("Alex",random.nextInt(10),loopLength),
                new Horse("Oleg",random.nextInt(10),loopLength),
                new Horse("Max",random.nextInt(10),loopLength),
                new Horse("Egor",random.nextInt(10),loopLength)

        );
        System.out.println("Start : ");
        for (Horse horse : horses){
            new Thread(horse).start();
        }

    }
}
