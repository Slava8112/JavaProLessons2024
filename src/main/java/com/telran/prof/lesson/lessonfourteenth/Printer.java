package com.telran.prof.lesson.lessonfourteenth;
public class Printer implements Printable {

    @Override
    public void print(String text) {
        System.out.println("Hello " + text);
    }
}
