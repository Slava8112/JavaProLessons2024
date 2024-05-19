package com.telran.prof.lesson.lessonsix.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternsOne {

        public static void main(String[] args) {
                List<String> stringList = new ArrayList<>();
                stringList.add("Heelo");
                stringList.add("IAM");
                stringList.add("WORlD");
                stringList.add("hi");
                TestPatternsOne testPatternsOne = new TestPatternsOne();

                System.out.println("Original list " + stringList);
                List<String> listOne = testPatternsOne.convertStringListToLowerCase(stringList);
                System.out.println("List in lower case : " + listOne);
                System.out.println("Original list " + stringList);

                testPatternsOne.convertCurrentListToLowerCase(stringList);
                System.out.println("Original list " + stringList);
        }

        private List<String> convertStringListToLowerCase(List<String> list) {
                List<String> newList = new ArrayList<>();
                for (String value : list) {
                        newList.add(value.toLowerCase());
                }
                return newList;
        }

        private void convertCurrentListToLowerCase(List<String> list) {
                for (int i = 0; i < list.size(); i++) {
                        list.set(i, list.get(i).toLowerCase());
                }
        }
}
