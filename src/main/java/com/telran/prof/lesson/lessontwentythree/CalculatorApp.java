package com.telran.prof.lesson.lessontwentythree;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5,7);
        int sub = calculator.sub(10,2);

        System.out.println("Sum sum " + sum);
        System.out.println("Sub " + sub);
    }
}
