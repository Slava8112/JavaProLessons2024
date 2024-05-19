package com.telran.prof.lesson.lessontwentytwo.wildcard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public class Person {
    private  String name;

//    public Person(String name) {
//        this.name = name;
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
