package com.telran.prof.lesson.lessonnineteen;

public class ExampleThree {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
        } catch (ArithmeticException exception) {
            System.out.println("Error during division");
        }

        try {
            div(15, 0);
        } catch (ArithmeticException exception) {
            System.out.println("Error during division");
        }
    }

    private static void div(int x, int y) throws ArithmeticException {
        System.out.println(x / y);
    }
}
