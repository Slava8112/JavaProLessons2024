package com.telran.prof.lesson.lessonten;

public class TestExampleTwo {

    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.setName("Barsik");
        Cat catTwo = new Cat();
        catTwo.setName("Barsik");

        boolean isEquals = catOne == catTwo; // always false !!!! (catOne = catTwo)
        System.out.println("catOne == catTwo " + isEquals);

        boolean isEqualsTwo = catOne.equals(catTwo);
        System.out.println("catOne equals catTwo " + isEqualsTwo);

        System.out.println("catOne equals catOne " + catOne.equals(catOne));

        System.out.println("catOne equals null " + catOne.equals(null));
    }
}
