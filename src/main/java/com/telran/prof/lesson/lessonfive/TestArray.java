package com.telran.prof.lesson.lessonfive;

public class TestArray {
    private static final int LENGTH_OF_ARRAY = 5;

    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arrayTwo = new int[]{2, 3, 4, 5, 6, 7};
        int[] arrayFree = {3, 4, 5, 6, 7, 8, 9};
        int[] arrayFour;
        //String hello = null;

        for (int i = 0; i < arrayFree.length; i++) {
            System.out.println("Element by index = " + arrayFree[i]);

        }
        for (int element : arrayTwo){
            System.out.println("Element by index = " + element);
        }
    }
}
