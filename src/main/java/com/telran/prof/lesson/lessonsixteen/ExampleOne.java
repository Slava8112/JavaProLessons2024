package com.telran.prof.lesson.lessonsixteen;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.stream(arr).forEach(System.out::println);

        int[][] array = {{1, 2, 3}, {15, 12, 18}, {7, 8, 10}};

        Arrays.stream(array)
                .forEach(element -> System.out.println(Arrays.toString(element)));

        Arrays.stream(array)
                .flatMapToInt(arrays -> Arrays.stream(arrays))
                .forEach(element -> System.out.print(" " + element));

        // 1 2 3 4 5 6
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println();
        int[] arr2 = {5, 8, 9, 10};

        Stream.of(arr, arr2)
                .flatMapToInt(Arrays::stream)
                .forEach(x -> System.out.print("_" + x));

        // List<String> list = Arrays.asList("Hello", "Java", "Class", "JDK", "SQL");

        List<String> collect = Stream.of("Hello", "Java", "Class", "JDK", "SQL")
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("\n" + collect);

        //
        String[][] strings = {{"a", "b"}, {"c", "a"}, {"e", "f"}};
        //filter "a" and print all elements
        System.out.println();

        List<String> collectString = Arrays.stream(strings)
                .flatMap(strings1 -> Arrays.stream(strings1))
                .filter(el -> !el.equals("a"))
                .collect(Collectors.toList());

        System.out.println(collectString);

        Stream.of(strings)
                .flatMap(Stream::of)
                .filter(x ->!"a".equals(x))
                .forEach(System.out::println);


    }
}
