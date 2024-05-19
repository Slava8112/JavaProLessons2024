package com.telran.prof.lesson.lessonthree.exampleabstract;

public abstract class HomeAnimal extends Animal {

    public HomeAnimal(String name) {
        super(name);
        // super() -  call parent constructor
        // this() - call current constructor
    }

    abstract void humanCare();
}
