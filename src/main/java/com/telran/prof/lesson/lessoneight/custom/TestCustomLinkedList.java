package com.telran.prof.lesson.lessoneight.custom;

public class TestCustomLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
        System.out.println(list);

        list.addFirst(10);
        System.out.println(list);
        list.addFirst(15);

        System.out.println(list);
        System.out.println("Size of linked list " + list.size());
        list.add(1,20);
        System.out.println(list);
        list.add(4,3);
        System.out.println(list);

    }
}
