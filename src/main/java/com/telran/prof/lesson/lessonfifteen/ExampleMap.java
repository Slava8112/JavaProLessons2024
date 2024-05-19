package com.telran.prof.lesson.lessonfifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class ExampleMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("One", 2),
                new Student("Three", 1),
                new Student("Four", 4),
                new Student("Two", 3)
        );

        List<String> nameList = new ArrayList<>();
        for (Student student : students) {
            nameList.add(student.getName());
        }
        System.out.println(nameList);

        Function<Student, String> convertorStudentToStudentName = student -> student.getName();

        List<String> names = new ArrayList<>();
        for (Student student : students) {
            String name = convertorStudentToStudentName.apply(student);
            names.add(name);
        }

        //map - intermediate , convert object from one type to other, or one to one
        List<String> studentsNames = students.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(studentsNames);

        List<String> strings = Arrays.asList("one", "hello", "bye", "end");
        List<String> collect = strings.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        // In - student list
        // stream - > list of names in upper case
        List<String> collect1 = students.stream()
                .map(student -> student.getName().toUpperCase())
                // .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }
}
