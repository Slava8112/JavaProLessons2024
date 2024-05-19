package com.telran.prof.lesson.lessoneleven.queue.exampleone;

public class Student {
    private String name;

    private int rate = 0;

    public Student(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

}
