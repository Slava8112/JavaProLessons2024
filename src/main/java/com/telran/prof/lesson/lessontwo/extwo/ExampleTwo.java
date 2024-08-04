package com.telran.prof.lesson.lessontwo.extwo;

public class ExampleTwo {

    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        fruit.setSugar(10);
//        System.out.println(fruit);

        Ananas ananas = new Ananas();
        ananas.setCellulose(20); // ananas
        ananas.setSugar(10);  // fruit
        ananas.setVitamins(new String[]{"A","B"}); // fruit

        Ananas ananas1 = new Ananas();
        ananas1.setCellulose(50);

        System.out.println(ananas);
        System.out.println(ananas1);
    }
}
