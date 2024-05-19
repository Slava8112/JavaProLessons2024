package com.telran.prof.lesson.lessonnine;
import java.util.HashSet;
import java.util.Set;

public class TestExampleEight {
    public static void main(String[] args) {
        String hello = "Hello world in Java!!!";
        char[] chars = hello.toCharArray();
        Set<Character> characters =  new HashSet<>();
        for(char value : chars) {
            characters.add(value);
        }
        System.out.println(characters);
    }
}
