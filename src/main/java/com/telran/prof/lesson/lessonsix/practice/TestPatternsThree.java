package com.telran.prof.lesson.lessonsix.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternsThree {
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

        TestPatternsThree testPatternsThree = new TestPatternsThree();
        int totalSum = testPatternsThree.getStringsSumLength(stringList);
        System.out.println("Total sum is = " + totalSum);

        int max = testPatternsThree.getMaxStringLength(stringList);
        System.out.println("Max length of element is = " + max);
    }

    private int getStringsSumLength(List<String> list) {
        int sum = 0;
        for (String value : list) {
            sum += value.length();
        }
        return sum;
    }

    private int getMaxStringLength(List<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
//            int currentLength = list.get(i).length();
//            if( max < currentLength) {
//                max = currentLength;
//            }
            max = Math.max(max, list.get(i).length());
        }
        return max;
    }
}
