package com.telran.prof.lesson.lessonten.selfWork;

public class TestSw {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Strasse", 15);
        Contact contactTwo = new Contact("Strasse", 15);

        Student alexOne = new Student("Alex", 30, contactOne);

        Student alexTwo = new Student("Alex", 30, contactTwo);

        //true
        System.out.println("is equals " + alexOne.equals(alexTwo));

        Contact contactThree = new Contact("Strasse", 10);
        Student alexThree = new Student("Alex", 30, contactThree);
        //false
        System.out.println("is equals " + alexOne.equals(alexThree));
    }
}
