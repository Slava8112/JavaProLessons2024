package com.telran.prof.lesson.lessonsix;

import java.util.ArrayList;

public class TestListTwo {
    public static void main(String[] args) {
        // add O(1)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        // add(0,1) O(n)
        list.add(0,3);// 3 4 5 6
        System.out.println(list);
        list.add(0,4);
        list.add(0,5);
        list.add(0,6);
        System.out.println(list);
        System.out.println(list.size());

        list.set(2,15);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);



    }
}
