package com.telran.prof.lesson.lessonnine;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleOne {
    public static void main(String[] args) {
        String inputData = "sskghfkghgkgfdekjghjkghfj dfkjghdjghkdgfg kjgfhksmdfkfhsdkjf ksdfhtfsdf";
        Set<Character> characters = new TreeSet<>();
        for (int i = 0; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);
        }

        System.out.println("Count of letters " + characters.size());
        System.out.println("Letters : " + characters);

        char[] chars = inputData.toCharArray();
    }
}
