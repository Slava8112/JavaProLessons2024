package com.telran.prof.homeworkOne.task2;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(456789123,"nokia",300);
        Phone phoneTwo = new Phone(985235444,"philips",350);
        Phone phoneFree = new Phone(155888254,"realmi",400);

        System.out.println("номер= " + phoneOne.getNumber() +  "\nмодель= " + phoneOne.getModel() + "\nвес= " + phoneOne.getWeight());

        System.out.println();

        System.out.println("номер= " + phoneTwo.getNumber() +  "\nмодель= " + phoneTwo.getModel() + "\nвес= " + phoneTwo.getWeight());

        System.out.println();

        System.out.println("номер= " + phoneFree.getNumber() +  "\nмодель= " + phoneFree.getModel() + "\nвес= " + phoneFree.getWeight());

        System.out.println();

        phoneOne.receiveCall();
        System.out.println(phoneOne.getNumber());

        System.out.println();

        phoneOne.receiveCall();
        System.out.println(phoneTwo.getNumber());

        System.out.println();

        phoneOne.receiveCall();
        System.out.println(phoneFree.getNumber());

        System.out.println();
    }

}
