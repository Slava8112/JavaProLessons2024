package com.telran.prof.lesson.lessonfifteen;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ExampleStudent {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("One", 2),
                new Student("Three", 1),
                new Student("Four", 4),
                new Student("Two", 3)
        );
        System.out.println(students);

//        for (Student student : students) {
//            student.setRate(student.getRate() * 2);
//        }
//
//        System.out.println(students);

        List<Student> highRateStudents = students.stream()
                .peek(student -> student.setRate(student.getRate() * 2))
                .filter(student -> student.getRate() > 5)
                .collect(Collectors.toList());

        System.out.println("High rate students " + highRateStudents);
        System.out.println("Original students " + students);
    }
}
