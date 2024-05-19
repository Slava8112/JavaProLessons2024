package com.telran.prof.lesson.lessontwentyone;

import java.time.*;
import java.util.Locale;
import java.util.Set;

public class ZoneExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime parse = ZonedDateTime.parse("2024-05-06T20:05:16.663639980+02:00[Europe/Warsaw]");
        System.out.println(parse);
        Set<String> availableZoneId = ZoneId.getAvailableZoneIds();
        for (String zone : availableZoneId){
            System.out.println(zone);
        }
//        ZonedDateTime of ZonedDateTime.of(LocalDate.now(), LocalTime.now(),ZoneId.of("America/Los_Angeles"));
//        ZonedDateTime of1 ZonedDateTime.of(LocalDate.now(), LocalTime.now(),ZoneId.of("Pacific/Majuro"))
//        System.out.println(of);
//        System.out.println(of1);
    }
}
