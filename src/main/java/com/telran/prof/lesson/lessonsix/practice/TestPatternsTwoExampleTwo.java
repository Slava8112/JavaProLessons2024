package com.telran.prof.lesson.lessonsix.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternsTwoExampleTwo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Heelo");
        stringList.add("IAM");
        stringList.add("WORlD");
        stringList.add("hi");
        stringList.add("WORlD");
        stringList.add("Welcome");
        stringList.add("Heelo");
        stringList.add("Heelo");
        System.out.println(stringList);
        TestPatternsTwoExampleTwo exampleTwo = new TestPatternsTwoExampleTwo();
        List<String> uniqueStringList = exampleTwo.getUniqueStringList(stringList);
        System.out.println(uniqueStringList);
    }

    private List<String> getUniqueStringList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }
        return newList;
    }
}
