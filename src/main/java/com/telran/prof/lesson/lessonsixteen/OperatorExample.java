package com.telran.prof.lesson.lessonsixteen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OperatorExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10", "20", "100", "10", "15", "50");

        // anyMatch - terminal
        System.out.println("any match 10 = " + strings.stream().anyMatch(s -> "10".equals(s)));

        //allMatch - terminal
        System.out.println("all match class == String is " + strings.stream()
                .allMatch(s -> s instanceof String));

        //min - terminal
        System.out.println("Result of min is " + strings.stream()
                .min((s1, s2) -> s1.compareTo(s2)).orElse(""));

        //findFirst - terminal
        List<Integer> integerList = Arrays.asList(2, 4, 5, 6, 8);

        Optional<Integer> first = integerList.stream()
                .filter(integer -> integer > 7)
                .findFirst();

        System.out.println("first element after filter is " + first.orElse(0));
        //toArray
        String[] arrays = strings.stream().toArray(String[]::new);
        String[] arrays2 = strings.stream().toArray(element -> new String[element]);
    }
}
