package com.telran.prof.lesson.lessonsixteen.itemapp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemApp {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Phone",25),
                new Item("Milk",15),
                new Item("Broad",2),
                new Item("Table",35),
                new Item("Phone",25),
                new Item("Phone",55),
                new Item("Door",50),
                new Item("Paper",4),
                new Item("Bear",5),
                new Item("Bear",65));

        //.collect(Collector.toSet())

        Set<Item> collect = items.stream()
                .filter(item -> item.getPrice() > 15)
                .collect(Collectors.toSet());
        System.out.println(collect);

        Optional<Integer> result = items.stream()
                .filter(item -> item.getPrice() > 15)
                .distinct()
                .map(Item :: getPrice)
                .reduce((a,b) -> (a + b ));
//        Integer integer = result.orElse(0);

        System.out.println("Sum of items price is " + result.get());

        Optional<Item> first = items.stream()
                .filter(item -> item.getPrice() > 100)
                .findFirst();
        System.out.println(first.isPresent() ? "Yes" : "No");
    }
}
