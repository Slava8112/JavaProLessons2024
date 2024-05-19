package com.telran.prof.lesson.lessoneleven.queue.customdeque;

import java.util.Arrays;

public class CustomArrayDeque implements MyDeque {

    private final Integer[] elements;

    private int head;

    private int tail;

    public CustomArrayDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be more than 1");
        }

        this.elements = new Integer[capacity];
        this.head = (capacity -1) / 2;
        this.tail = head;
    }

    @Override
    public void addToHead(Integer element) {

    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public Integer pollHead() {
        return null;
    }

    @Override
    public Integer pollTail() {
        tail--;
        Integer element = elements[tail];
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peelTail() {
        Integer element = elements[head];
        head++;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail - 1; i >= head; i --){
            sb.append(elements[i]).append("  ");
        }
        return sb.toString();
    }
}
