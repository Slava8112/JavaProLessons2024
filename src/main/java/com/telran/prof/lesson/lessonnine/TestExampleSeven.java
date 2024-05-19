package com.telran.prof.lesson.lessonnine;
import java.util.HashSet;
import java.util.Set;

public class TestExampleSeven {
    public static void main(String[] args) {
        //Alex code -646029981
        Person alex = new Person("Alex", "Alexeev", 30);
        Person oleg = new Person("Oleg", "Olegov", 35);
        Person maxim = new Person("Maxim", "Maximov", 40);

        System.out.println("Alex code " + alex.hashCode());
        System.out.println("Oleg code " + oleg.hashCode());
        System.out.println("Maxim code " + maxim.hashCode());

        Set<Person> people = new HashSet<>();
        people.add(alex);
        people.add(oleg);
        people.add(maxim);

        System.out.println(people);
        System.out.println("Size of set is " + people.size());

        Person testPerson = new Person("Oleg", "Olegov", 35);
        System.out.println("Testperson code " + testPerson.hashCode());
        System.out.println("Is equals " + (oleg == testPerson));
        people.add(testPerson);

        System.out.println(people);
        System.out.println("Size of set is " + people.size());

        alex.setAge(31);
        System.out.println("Alex new hashcode " + alex.hashCode());

        if (people.contains(alex)) {
            System.out.println("Ouu we found Alex in set!!");
        } else {
            System.out.println("We did not find alex in set!!!");
        }
        people.add(alex);
        System.out.println(people);
        System.out.println("Size of set is " + people.size());
    }
}
