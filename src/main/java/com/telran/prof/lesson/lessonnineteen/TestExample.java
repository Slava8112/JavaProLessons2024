package com.telran.prof.lesson.lessonnineteen;

import java.util.Scanner;

public class TestExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age : ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        //Throwable - родительский класс всех исключений

        //Checked - типы исключения, которое необходимо обрабатывать в коде
        //(try-catch or throws) - обрабатывать обязательно

        //Unchecked - тип исключений,которые можем обрабатывать ,а можем и нет
        //extends from RuntimeException

        //   Throwable
        //     Error    и       Exception
        //                 (checked ,unchecked)

        //catch (Exception e)

    }
}
