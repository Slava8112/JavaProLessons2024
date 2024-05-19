package com.telran.prof.lesson.lessonten.compareperson;

import java.util.Comparator;

public class CustomComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int resultByName = o1.getName().compareTo(o2.getName());
        int resultByAge = o1.getAge() - o2.getAge();
        return resultByName == 0 ? resultByAge : resultByName;
    }
}