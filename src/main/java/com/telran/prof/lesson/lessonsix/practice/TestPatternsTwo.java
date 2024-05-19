package com.telran.prof.lesson.lessonsix.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternsTwo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Heelo");
        stringList.add("IAM");
        stringList.add("WORlD");
        stringList.add("hi");
        int length = 5;

        TestPatternsTwo testPatternsTwo = new TestPatternsTwo();
        List<String> filteredList = testPatternsTwo.getFilteredStringListBySize(stringList, length);
        System.out.println(filteredList);
    }

    private List<String> getFilteredStringListBySize(List<String> list, int size) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.length() == size) {
                newList.add(value);
            }
        }
        return newList;
    }
}
