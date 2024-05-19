package com.telran.prof.lesson.lessonfifteen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ExampleFlatMap {
    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1, 2, 3);
        List<Integer> two = Arrays.asList(4, 5, 6);

        List<List<Integer>> list = new ArrayList<>();
        list.add(one);
        list.add(two);

        // 1 2 3 4 5 6 -> 2 4 6 8 10 12

        list.stream()
                .flatMap(integerList -> integerList.stream())
                .map(integer -> integer * 2)
                .forEach(integer -> System.out.print(" " + integer));

        List<List<List<Integer>>> testList = new ArrayList<>();
        testList.add(list);
        System.out.println();
        List<Integer> collect = testList
                .stream()
                .flatMap(lists -> lists.stream())
                .flatMap(integerList -> integerList.stream())
                .map(integer -> integer * 3)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
