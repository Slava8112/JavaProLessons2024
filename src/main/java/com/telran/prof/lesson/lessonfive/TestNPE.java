package com.telran.prof.lesson.lessonfive;

public class TestNPE {
    public static void main(String[] args) {
        String hello = "Hello";
        checkString(hello);

        checkString(null);

    }
    private static void checkString(String str) {
        if ("Hello".equals(str)) {
            System.out.println("Hello! Hello");
        }
    }
}
