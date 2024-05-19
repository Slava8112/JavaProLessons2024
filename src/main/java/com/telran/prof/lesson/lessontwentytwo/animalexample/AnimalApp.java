package com.telran.prof.lesson.lessontwentytwo.animalexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion");

        SmallCat catOne = new SmallCat("CatOne");
        SmallCat catTwo = new SmallCat("CatTwo");
        Cat cat = new Cat("Cat");

        BigDog dogOne = new BigDog("dogOne");
        Dog dogOriginal = new Dog("DogOriginal");

        List<Animal> animals = new ArrayList<>(Arrays.asList(
                lion, catOne, catTwo, cat, dogOne));
        animals.add(dogOriginal);

        List<SmallCat> smallCats = new ArrayList<>(Arrays.asList(catOne, catTwo));
        List<Cat> cats = new ArrayList<>(Arrays.asList(cat));

        //add small cat in smallcat list
        addCat(smallCats);

        //add small cat in cat list
        addCat(cats);

        //add small cat in animal list
        addCat(animals);
    }

    private static void addCat(List<? super SmallCat> cats) {
        SmallCat smallCat = new SmallCat("smallCat");
        cats.add(smallCat);
    }
}
