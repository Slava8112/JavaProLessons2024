package com.telran.prof.lesson.lessontwentytwo.animalexample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class AnimalExample {
    public static void main(String[] args) {
        SmallCat small = new SmallCat("small");

        List<SmallCat> smallCats = new ArrayList<>();
        smallCats.add(small);

        List<Cat> cats = new ArrayList<>();
        cats.add(small);

        List<Animal> animals = new ArrayList<>();
        animals.add(small);

        addCat(smallCats, small);
        addCat(cats, small);
        addCat(animals, small);

        printCat(animals);
        printCat(cats);
        printCat(smallCats);
    }

    //PECS - Producer Extends, Consumer Super

    //PECS - Consumer
    // List<SmallCat>,List<Cat>,List<Animal>
    //может принять любой тип данных в списке кто является SmallCat или его родителем
    //super SomeClass - SomeClass and all parent class
    private static void addCat(List<? super SmallCat> list, SmallCat smallCat) {
        list.add(smallCat);
    }

    //List<? extends Object> === List<?>

    //PECS - Producer
    //extends SomeClass - SomeClass and all child class
    private static void printCat(List<? extends Animal> list) {
        System.out.println(list);
    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal);
    }
}
