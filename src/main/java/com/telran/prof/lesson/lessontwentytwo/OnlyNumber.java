package com.telran.prof.lesson.lessontwentytwo;

public class OnlyNumber<T extends Number,U extends Number> {
    private  T numberOne;
    private U numberTwo;

    public OnlyNumber(T numberOne, U numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    public void sum(){
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
}
