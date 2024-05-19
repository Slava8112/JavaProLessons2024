package com.telran.prof.lesson.lessonsix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {
        //List
        //arrayList - динамическмй массив,список
        // array - elementData, size = 10
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello"); // 0
        listOne.add("I"); // 1
        listOne.add("am");// 2
        listOne.add("Java");// 3
        listOne.add("Hello");// 4
        listOne.add("I");// 5
        listOne.add("am");// 6
        listOne.add("Java");// 7
        listOne.add("Hello");// 8
        listOne.add("I");// 9
        //size * 1,5 = 15;
        //System.arraycopy
        //elementData = new array with size 15;
        listOne.add("am");// 10
        listOne.add("Java");// 11

        System.out.println(listOne);
        System.out.println(listOne.size());

        for (String element : listOne){
            System.out.println(element);
        }
        System.out.println();
        //get - get element
        String elementOne = listOne.get(2);
        System.out.println(elementOne);

        for (int i = 0; i < listOne.size(); i ++){
            System.out.println("element by index " + i + " = " + listOne.get(i));
        }
    }
}
