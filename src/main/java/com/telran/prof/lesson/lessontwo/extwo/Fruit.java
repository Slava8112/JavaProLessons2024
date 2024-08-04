package com.telran.prof.lesson.lessontwo.extwo;

import java.util.Arrays;

public class Fruit {

    private String[] vitamins;
    private int sugar;

    public Fruit() {
        System.out.println("Super class constructor");

        System.out.println("Super class object hashcode : " + this.hashCode());
        System.out.println(this.getClass().getName());
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "vitamins=" + Arrays.toString(vitamins) +
                ", sugar=" + sugar +
                '}';
    }
}


