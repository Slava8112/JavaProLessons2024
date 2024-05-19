package com.telran.prof.lesson.lessonten.comparestudent;

public class CourseListener implements Comparable<CourseListener> {

    private String name;

    private int rate;

    public CourseListener(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CourseListener{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(CourseListener o) {
        return this.rate - o.rate;
    }
}
