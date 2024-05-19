package com.telran.prof.lesson.lessoneleven.queue.customdeque;

public interface MyDeque {

    void addToHead(Integer element);

    void addToTail(Integer element);

    Integer pollHead();

    Integer pollTail();

    Integer peekHead();

    Integer peelTail();

    boolean isEmpty();
}
