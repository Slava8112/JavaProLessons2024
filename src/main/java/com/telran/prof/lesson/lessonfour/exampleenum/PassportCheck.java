package com.telran.prof.lesson.lessonfour.exampleenum;

import java.util.Scanner;

public class PassportCheck {

    public static void main(String[] args) {
        System.out.println("Input passport year of issue");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Passport passport = null;
        PassportType[] passportTypes = PassportType.values();
        for (PassportType type : passportTypes) {
            if (year >= type.getStartYear() && year <= type.getEndYear()) {
                passport = new Passport(type);
            }
        }

        System.out.println("Passport is " + passport);
    }
}
