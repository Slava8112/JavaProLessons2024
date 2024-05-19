package com.telran.prof.lesson.lessontwentytwo.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        StudentPerson alex = new StudentPerson("Alex");
        StudentPerson oleg = new StudentPerson("Oleg");
        Person maxim = new Person("Maxim");

        List<Person> people = new ArrayList<>();
        people.add(alex);
        people.add(oleg);
        people.add(maxim);

        List<StudentPerson> studentPeople = new ArrayList<>();
        studentPeople.add(oleg);
        studentPeople.add(alex);

        chekPersonAndAdd(people);
        // chekPersonAndAdd(studentPeople);

        checkPerson(studentPeople);
        addPerson(studentPeople);
    }

    private static void chekPersonAndAdd(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);
    }

    //PECS - Producer Extends, Consumer Super

    //? extends SomeClass - принимает тип данных, который является наследником SomeClass
    //people - отдает нам список и является Producer
    private static void checkPerson(List<? extends Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    //? super SomeClass - принимает тип данных, который является родителем SomeClass, или SomeClass
    //people - принимает новые элементы и является Consumer
    private static void addPerson(List<? super StudentPerson> people) {
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);
    }
}
