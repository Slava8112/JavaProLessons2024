package com.telran.prof.lesson.lessonten;

import java.util.Objects;

public class Cat {
    private String name;

    private int age;

    public Cat() {
        //
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Call equals for object " + this.name + ", " + this.age
                +" compare to  " + o.toString());
        if (this == o) return true;
        if (o == null || !(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Call hashcode for object " + this.name + ", " + this.age);
        return Objects.hash(name, age);
    }

    //    public boolean equals(Object obj) {
//        //1
//        if (this == obj) return true;
//        //2
//        if (obj == null) return false;
//        //3
//        if (!(obj instanceof Cat)) return false;
//        //4
//        Cat cat = (Cat) obj;
//
//        if(this.age != cat.age) return false;
//
//        if (this.name == null) return cat.name == null;
//
//        return this.name.equals(cat.name);
//    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
