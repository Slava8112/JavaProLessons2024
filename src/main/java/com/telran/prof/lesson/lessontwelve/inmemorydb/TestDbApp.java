package com.telran.prof.lesson.lessontwelve.inmemorydb;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TestDbApp {
    public static void main(String[] args) {
        Student alex = new Student(1, "Alex", 35);
        Student oleg = new Student(2, "Oleg", 20);
        Student egor = new Student(3, "Egor", 30);
        Student max = new Student(4, "Max", 55);

        List<Student> students = Arrays.asList(alex, oleg, egor, max);
        int id = 3;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found " + student);
            }
        }

        InMemoryDatabase database = new InMemoryDatabase();
        students.forEach(student -> database.addStudent(student));

        Student student = database.getStudent(id);
        System.out.println("Found " + student);

//        Map<Integer, Student> map = new HashMap<>();
//        map.put(alex.getId(), alex);
//        map.put(oleg.getId(), oleg);
//        map.put(egor.getId(), egor);
//        map.put(max.getId(), max);

//        Student student = map.get(id);
//        System.out.println("Found " + student);
    }
}
