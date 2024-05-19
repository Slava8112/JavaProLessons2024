package com.telran.prof.lesson.lessonnine;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class TestExampleTwo {
    public static void main(String[] args) {
        String inputData = "sskghfkghgkgfdekjghjkghfj dfkjghdjghkdgfg kjgfhksmdfkfhsdkjf ksdfhtfsdf";
        char[] chars = inputData.toCharArray();
        Set<Character> characters = new TreeSet<>();
        Set<Character> duplicateSet = new TreeSet<>();
        for (char temp : chars) {
            boolean resultOfAdd = characters.add(temp);
            if (!resultOfAdd) {
                duplicateSet.add(temp);
            }
//            if (characters.contains(temp)) {
//                duplicateSet.add(temp);
//            } else {
//                characters.add(temp);
//            }
        }
        System.out.println("Original data " + Arrays.toString(chars));
        System.out.println("All elements " + characters);
        System.out.println("Elements with 2 and more times " + duplicateSet);

        for (char value : characters) {
            if (!duplicateSet.contains(value)) {
                System.out.println("Unique element : " + value);
            }
        }
    }
}
