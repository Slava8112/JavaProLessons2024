package com.telran.prof.lesson.lessonnine;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestExampleThree {
    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");

        System.out.println(stringSet);
        System.out.println("First element " + stringSet.first());
        System.out.println("Last element " + stringSet.last());

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }
}
