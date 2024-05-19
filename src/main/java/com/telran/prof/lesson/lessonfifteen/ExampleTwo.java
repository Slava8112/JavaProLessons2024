package com.telran.prof.lesson.lessonfifteen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class ExampleTwo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "1", "10", "15", "50", "20");
        System.out.println(list);
        //filter - intermediate, use filter(use FI Predicate) , true -> go further , false - rejected
        int result = 0;
        for (String element : list) {
            if (element.equals("10")) {
                result++;
            }
        }
        System.out.println(result);

        Predicate<String> filterByElement = element -> "10".equals(element);
        boolean test = filterByElement.test("20");
        // count - terminal,  count of elements in stream
        long count = list.stream().filter(element -> "10".equals(element)).count();
        System.out.println("Count of elements equals 10 is " + count);

        long count1 = list.stream().filter(s -> s.equals("20")).count();
        System.out.println("Count of elements equals 20 is " + count1);

        //sorted - intermediate, sort stream
        //foreach - terminal, make action for each element of stream
        list.stream().sorted().forEach(System.out::println);
        System.out.println(list);

        //collect - terminal, collect element of stream to new collection
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        List<String> collect = list.stream().filter(s -> s.equals("10")).collect(Collectors.toList());

        //limit, skip - intermediate , limit count of elements in stream, skip - skip elements

        List<String> limitedList = list.stream().limit(3).collect(Collectors.toList());
        List<String> skippedList = list.stream().skip(3).collect(Collectors.toList());
        System.out.println("Original list = " + list);
        System.out.println("Limited list = " + limitedList);
        System.out.println("Skipped list = " + skippedList);

        List<String> sortedAndLimitList = list.stream().sorted().limit(2).collect(Collectors.toList());
        List<String> sortedAndSkippedList = list.stream().sorted().skip(4).collect(Collectors.toList());

        System.out.println("Limited and sorted list = " + sortedAndLimitList);
        System.out.println("Skipped and sorted list = " + sortedAndSkippedList);

        //distinct , intermediate, only unique elements in stream
        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List of unique elements is " + uniqueList);

        //peek - intermediate, analog foreach - make action for each element , but return stream
        List<String> newList = list.stream().peek(s -> System.out.print(" " + s)).collect(Collectors.toList());
        Consumer<String> stringConsumer = s -> System.out.print(" " + s);
        stringConsumer.accept("Hello");
    }

    private static List<String> convertToUpperCase(List<String> strings) {
        List<String> upperCaseList = new ArrayList<>();
        for (String element : strings) {
            if (element.length() == 10) {
                String s = element.toUpperCase();
                if (s.startsWith("K")) {
                    upperCaseList.add(s);
                }
            }
        }

        return upperCaseList;
    }

    private static List<String> convertToUpperCaseByStream(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() == 10)
                .filter(s -> s.startsWith("K"))
                .collect(Collectors.toList());
    }
}
