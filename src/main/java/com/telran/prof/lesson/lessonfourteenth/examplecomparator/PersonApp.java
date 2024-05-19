package com.telran.prof.lesson.lessonfourteenth.examplecomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {
        Person oleg = new Person("Oleg", 10);
        Person alex = new Person("Alex", 30);
        Person egor = new Person("Egor", 50);
        List<Person> list = Arrays.asList(oleg, alex, egor);
        System.out.println(list);

        // AgeComparator ageComparator = new AgeComparator();

        Comparator<Person> ageComparatorTwo = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        //Comparator<Person> ageComparatorThree = (o1, o2) -> o1.getAge()-o2.getAge();
        //Сортировка по возрасту
        Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(list);
        //Сортировка по имени
        Collections.sort(list, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        System.out.println(list);
    }
}
