package com.telran.prof.lesson.lessoneleven.queue.customdeque;

public class CustomDequeApp {

    public static void main(String[] args) {
        MyDeque customArrayDeque = new CustomArrayDeque(16);
        customArrayDeque.addToHead(10);
        customArrayDeque.addToHead(15);
        customArrayDeque.addToTail(5);
        customArrayDeque.addToTail(8);
        // 8 5 10 15

        //head = 5;
        //tail = 5;
        //___ _ 15 10 5 8 _ _ __//
        // 1 2 4 5 6 7 8

        System.out.println(customArrayDeque);
        System.out.println(customArrayDeque.pollHead());
        System.out.println(customArrayDeque.pollTail());

        System.out.println(customArrayDeque);
    }
}
