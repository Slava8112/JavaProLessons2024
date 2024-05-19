package com.telran.prof.lesson.lessonsixteen.studentlib;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibApp {
    public static void main(String[] args) {
        Student alex = new Student(1, "Alex");
        alex.addBook("Java 8");
        alex.addBook("Spring Boot in Action");
        alex.addBook("Kotlin in Action");
        alex.addBook("CTCI");

        Student max = new Student(2, "Max");
        max.addBook("Java 9");
        max.addBook("Spring Boot in Action");
        max.addBook("Kotlin in Action");

        Student oleg = new Student(3, "Oleg");
        oleg.addBook("Java 9");
        oleg.addBook("Spring Boot in Action");
        oleg.addBook("Kotlin in Action");
        oleg.addBook("CTCI");
        oleg.addBook("Effective Java");


        List<String> readBooks = Stream.of(alex, max)
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(readBooks);

        List<Student> students = Arrays.asList(alex, max, oleg);
        for (Student student : students) {
            if (student.getBooks().size() > 3) {
                //Student student = findById(long id);
            }
        }

        List<Long> collect = students.stream()
                .filter(student -> student.getBooks().size() > 3)
                .map(student -> student.getId())
                .collect(Collectors.toList());
        // List<Student> studentEntityList = getAllByIds(collect);

    }
}
