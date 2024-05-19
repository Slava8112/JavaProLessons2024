package com.telran.prof.lesson.lessonseven;

import java.util.Arrays;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D","E");
        for (String value : list){
            System.out.println(" "+ value);
        }

        list.forEach(value ->{
            System.out.print(" " + value);
        });
    }

}
