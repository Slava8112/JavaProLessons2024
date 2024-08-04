package com.telran.prof.lesson.lessonone;

public class TestPuppy {
    public static void main(String[] args) {
        Puppy smallPuppy = new Puppy();
        String nameSmallPuppy = smallPuppy.name;
        System.out.println("Name small puppy = " + nameSmallPuppy);
        smallPuppy.name = "Barbos";
        System.out.println("Name small puppy = " + smallPuppy.name);

        Puppy middlePuppy = new Puppy();
        String nameMiddlePappy = middlePuppy.name;
        System.out.println("Name middle puppy = " + nameMiddlePappy);

        Dog bigDog = new Dog();

        Puppy bigPuppy = new Puppy();
        String nameBigPappy = bigPuppy.name;
        System.out.println("Name big puppy = " + nameBigPappy);

        Puppy namedPuppy = new Puppy("Baget");
        String nameNamedPuppy = namedPuppy.name;
        System.out.println("Name named puppy = " + nameNamedPuppy);

        Puppy fullReadyPuppy = new Puppy("Corjik",1);
        System.out.println("Name full puppy = " + fullReadyPuppy.name);
        System.out.println("Age full Ready puppy = " + fullReadyPuppy.age);
    }
}
