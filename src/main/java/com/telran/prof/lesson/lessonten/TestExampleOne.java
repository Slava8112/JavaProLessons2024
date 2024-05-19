package com.telran.prof.lesson.lessonten;

public class TestExampleOne {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        boolean isEquals = a == b;
        System.out.println("a == b : " + isEquals);

        Integer c = Integer.valueOf(10);
        boolean isEqualsTwo = a == c;
        System.out.println("a == c : " + isEqualsTwo);
    }
}
