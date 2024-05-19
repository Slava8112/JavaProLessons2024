package com.telran.prof.lesson.lessonsix;

import java.util.ArrayList;

public class TestListThree {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        stringArrayList.add("Hello");
        stringArrayList.add("World");
        System.out.println(stringArrayList);

        integerArrayList.add(5);
        integerArrayList.add(10);
        System.out.println(integerArrayList);

        stringArrayList.remove("World");
        System.out.println(stringArrayList);

        integerArrayList.remove(Integer.valueOf(10));
        System.out.println(integerArrayList);
    }
}
