package com.telran.prof.lesson.lessontwo.exone;

public class SmallDog extends Dog {

    @Override
    public void voice() {
        super.voice();// вызов метода voice из род класса
        System.out.println("Small dog voice!");
    }

    public void jump(){
        System.out.println("Small dog jump!");
    }
}

