package com.telran.prof.lesson.lessoneleven.queue.exampleone;

import java.util.Comparator;

public class RateComparator implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (-1) * (o1.getRate() - o2.getRate());
    }
}
