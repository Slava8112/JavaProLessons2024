package com.telran.prof.lesson.lessoneleven.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleArrayDeque {
    public static void main(String[] args) {
        //FIFO
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("One");
        stringDeque.add("Two");
        stringDeque.add("Three");
        //three -> two -> one

        stringDeque.addFirst("Four");
        stringDeque.addLast("Five");
        System.out.println(stringDeque);

        //one ; two ; three

        System.out.println(stringDeque.pollFirst());
        System.out.println(stringDeque.pollLast());
        System.out.println(stringDeque.poll());
        System.out.println(stringDeque.poll());
        System.out.println(stringDeque.poll());

    }
}
