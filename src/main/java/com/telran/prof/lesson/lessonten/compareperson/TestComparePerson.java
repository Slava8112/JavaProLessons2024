package com.telran.prof.lesson.lessonten.compareperson;
import java.util.*;

public class TestComparePerson {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", 54),
                new Person("Maxim", 30),
                new Person("Alex", 20),
                new Person("Maxim", 10)
        );
        System.out.println(people);
        CustomComparator customComparator = new CustomComparator();
        Collections.sort(people,customComparator);
        System.out.println(people);

        System.out.println("Person in set :");
        Set<Person> personSet = new TreeSet<>(customComparator);
        personSet.add(new Person("Alex", 54));
        personSet.add(new Person("Alex", 20));
        personSet.add(new Person("Maxim", 10));
        System.out.println(personSet);
    }
}
