package com.telran.prof.lesson.lessontwentyone;

import java.time.*;

public class TaskExample {
    public static void main(String[] args) {
        //check that date 10 Jan 1985 is Friday
        //minus 10 years and print to console
        //Create ZoneDateTime at 01.01.1980 20-00-00 Pacific/Midway

        LocalDate localDate = LocalDate.of(1985,1,10);
        DayOfWeek day = localDate.getDayOfWeek();
        System.out.println("is Friday" + (day == DayOfWeek.FRIDAY));

        System.out.println(localDate.minusYears(10));

        LocalDate localDate1 = LocalDate.of(1980,1,1);
        LocalTime localTime = LocalTime.of(20,0,0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate1, localTime, ZoneId.of("Pacific/Midway"));
        System.out.println(zonedDateTime);

    }
}
