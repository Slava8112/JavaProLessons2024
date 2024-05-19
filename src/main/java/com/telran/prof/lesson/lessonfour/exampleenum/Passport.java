package com.telran.prof.lesson.lessonfour.exampleenum;

public class Passport {

    private PassportType passportType;

    public Passport(PassportType passportType) {
        this.passportType = passportType;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportType=" + passportType +
                '}';
    }
}