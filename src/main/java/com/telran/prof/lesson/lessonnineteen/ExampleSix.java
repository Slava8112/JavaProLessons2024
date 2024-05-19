package com.telran.prof.lesson.lessonnineteen;

public class ExampleSix {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Incorrect index");
        }

        System.out.println("Hello");

        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Incorrect index");
        }

        String s = null;
        try {
            System.out.println(s.toUpperCase());
        } catch (NullPointerException exception) {
            System.out.println("Incorrect index");
        }
    }
}
