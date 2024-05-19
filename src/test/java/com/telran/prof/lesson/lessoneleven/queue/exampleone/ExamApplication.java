package com.telran.prof.lesson.lessoneleven.queue.exampleone;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ExamApplication {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex"),
                new Student("Oleg"),
                new Student("Max"),
                new Student("Egor"),
                new Student("Slava"));

        Random random = new Random();
        for (Student currentStudent : students) {
            currentStudent.setRate(random.nextInt(100));
        }

        System.out.println(students);

        PriorityQueue<Student> studentQueue = new PriorityQueue<>(new RateComparator());
        for (Student currentStudent : students) {
            studentQueue.add(currentStudent);
        }

        System.out.println(studentQueue);

        System.out.println("First position : " + studentQueue.poll());
        System.out.println("Second position : " + studentQueue.poll());
        System.out.println("Third position : " + studentQueue.poll());
    }
}
