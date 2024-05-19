package com.telran.prof.lesson.lessonten.campare;

import java.util.Comparator;

public class SortByYear implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
//        if (o1.getYear() == o2.getYear()) return 0;
//        if (o1.getYear() < o2.getYear()) return -1;
//        //o1.getYear() > o2.getYear()
//        return 1;
        return o1.getYear() - o2.getYear();
    }
}
