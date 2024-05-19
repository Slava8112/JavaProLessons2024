package com.telran.prof.lesson.lessonnine;
import java.util.Set;
import java.util.TreeSet;
public class TestExampleFour {
    public static void main(String[] args) {
        //Does not work!
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Alex"));
        people.add(new Person("Oleg"));
        System.out.println(people);
    }
}
