package com.telran.prof.lesson.lessonthree.exampleabstract;

public class ExampleAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Barsik");
        Cow cow = new Cow("Burenka");
        Cow maska = new Cow("Maska");
        System.out.println(cow.getName());
        System.out.println(maska.getName());

        System.exit(0);

        Horse horse = new Horse("Max");
        // new Animal(); - создать объект на основании абстрактного класса нельзя

        dog.eat();
        cow.eat();
        cow.produceMilk();
        horse.jump();
        horse.eat();

        Animal[] animals = {dog,cow,horse};
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}