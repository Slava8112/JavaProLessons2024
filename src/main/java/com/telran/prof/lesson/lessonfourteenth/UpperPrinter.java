package com.telran.prof.lesson.lessonfourteenth;

public class UpperPrinter implements Printable {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
