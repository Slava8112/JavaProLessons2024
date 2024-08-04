package com.telran.prof.lesson.lessonone;

public class Puppy {

    String name;
    int age;

    public Puppy (){
        //конструктор без параметров
        System.out.println("Hello call from constructor puppy class");
    }

    public Puppy(String namePuppy) {
        //конструктор с параметрами
        name = namePuppy;
    }
    public Puppy(String namePuppy,int agePuppy){
        name = namePuppy;
        age = agePuppy;
    }
}
