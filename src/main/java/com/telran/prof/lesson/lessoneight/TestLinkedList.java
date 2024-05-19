package com.telran.prof.lesson.lessoneight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        //LinkedList - связный список
        //в общем это однонаправленный саязанный список

        //в Java  - класс LinkedList -это двунаправленный саязанный список


        //ArrayList VS LinkedList
        //в массиве элементы располагаются друг за другом
        // в связанном списке элементы в различных областях памяти

        List<String> listOne = new ArrayList<>();
        listOne.add("One");
        listOne.add("Two");
        listOne.add("Three");

        System.out.println(listOne.get(1));

        List<String> listTwo = new LinkedList<>();
        listTwo.add("One");
        listTwo.add("Two");
        listTwo.add("Three");
        System.out.println(listTwo.get(1));

        listOne.add(0,"Four");
        listTwo.add(0,"Four");



    }
}
