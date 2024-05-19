package com.telran.prof.lesson.lessonnineteen;

public class ExampleEight {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 0};
            System.out.println(array[4] / array[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {

            System.out.println(exception instanceof ArithmeticException ?
                    "Incorrect operation with division" : "Incorrect operation with array");
        }
    }
}
