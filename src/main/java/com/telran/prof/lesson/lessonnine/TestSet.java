package com.telran.prof.lesson.lessonnine;

import java.util.Set;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

        public static void main(String[] args) {
            //Set - intf
            //SortedSet, NavigableSet - intf
            //TreeSet, HashSet

            //TreeSet - хранит только уникальные элементы, порядка нет, но есть сортировка

            //HashSet - хранит только уникальные элементы, порядка нет

            //ArrayList  get O(1), contains O(n) - Arr,LinkedList

            // add, remove, contains - O(log(N))
            Set<String> stringSet = new TreeSet<>();
            stringSet.add("B");
            stringSet.add("C");
            stringSet.add("A");
            stringSet.add("B");

            System.out.println(stringSet);
            System.out.println("Set contains 'C' " + stringSet.contains("C"));

        }
}
