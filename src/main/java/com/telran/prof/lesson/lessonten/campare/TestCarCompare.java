package com.telran.prof.lesson.lessonten.campare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCarCompare {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car(1990, "Volvo"),
                new Car(1870, "Ford"),
                new Car(1940, "Bmw"),
                new Car(2000, "Imobil")
        );
        System.out.println("Cars before all sort: " + cars);
        SortByYear sortByYear = new SortByYear();
        Collections.sort(cars, sortByYear);
        System.out.println("Cars after sort by year: " + cars);

        SortByName sortByName = new SortByName();
        Collections.sort(cars, sortByName);
        System.out.println("Cars after sort by name: " + cars);

//        Comparator<Car> carComparator = Comparator.comparingInt(Car::getYear);
//
//        Collections.sort(cars,Comparator.comparingInt(Car::getYear));
    }
}
