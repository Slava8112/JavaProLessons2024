package com.telran.prof.lesson.lessontwentyone;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDataExample {
    public static void main(String[] args) {
        //LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        int year = currentDate.getYear();
        Month month = currentDate.getMonth();
        int dayOfMonth = currentDate.getDayOfMonth();
        int monthValue = currentDate.getMonthValue();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.printf("%d.%d.%d \n", dayOfMonth, monthValue, year);

        LocalDate date = LocalDate.of(2024,02,01);
        System.out.println(date);

        date = date.plusYears(2);
        date = date.plusDays(5);
        date = date.plusMonths(5);
        System.out.println(date);

        date = date.minusDays(10);
        date = date.minusYears(10);
        System.out.println(date);
    }
}
