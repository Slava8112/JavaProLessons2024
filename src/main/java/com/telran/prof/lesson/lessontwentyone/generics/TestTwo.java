package com.telran.prof.lesson.lessontwentyone.generics;

public class TestTwo<T, U> {
    private T obj;
    private U objTwo;

    public TestTwo(T obj,U objTwo) {
        this.obj = obj;
        this.objTwo = objTwo;
    }

    public void print(){
        System.out.println(obj);
        System.out.println(objTwo);
    }
    public T getObj() {
        return obj;
    }

    public U getObjTwo() {
        return objTwo;
    }
}
