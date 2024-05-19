package com.telran.prof.lesson.lessonfour.exampleenum;

import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {
        Day[] values = Day.values();
        System.out.println(Arrays.toString(values));

        String monday = "MONDAY";
        Day day = Day.valueOf(monday);
        System.out.println(day);

        int index = Day.THURSDAY.ordinal();
        System.out.println(index);
        checkDay(Day.THURSDAY.ordinal());

        System.out.println(Day.SUNDAY.name());

    }

    private static void checkDay(int index){
        if (index ==4){
            System.out.println("start all");
        }
    }
}
