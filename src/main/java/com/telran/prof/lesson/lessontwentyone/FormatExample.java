package com.telran.prof.lesson.lessontwentyone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now  = LocalDateTime.now();
        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        System.out.println(DateTimeFormatter.ISO_DATE.format(now));
    }
}
