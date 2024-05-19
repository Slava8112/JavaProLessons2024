package com.telran.prof.lesson.lessonten.selfWork;

public class Student {
    private String name;
    private int age;
    private Contact contact;

    public Student(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;


        return this.name.equals(student.name)
                && this.age == student.age
                && this.contact.equals(student.contact);
    }
}
