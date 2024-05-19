package com.telran.prof.lesson.lessontwentyone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        //LocalDateTime - date + time
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        System.out.println(current.getDayOfWeek());
        System.out.println(current.getMonthValue());

        int hour = current.getHour();
        int monthValue = current.getMonthValue();

        current = current.plusDays(10);
        current = current.plusSeconds(342);

        LocalDateTime timeOne = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(timeOne);
        LocalDateTime dateTime = LocalDateTime.of(2020,05,10,20,20,30);
        System.out.println(dateTime);

        dateTime = dateTime.plusHours(100);
        System.out.println(dateTime);

        LocalDate date = current.toLocalDate();
        LocalTime time = current.toLocalTime();


    }
}
