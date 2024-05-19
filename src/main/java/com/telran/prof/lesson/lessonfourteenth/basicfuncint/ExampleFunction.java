package com.telran.prof.lesson.lessonfourteenth.basicfuncint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExampleFunction {

    public static void main(String[] args) {
        //Function -> V apply(T t);
        Function<Integer, Double> half = a -> a / 2.0;
        Double result = half.apply(7);
        System.out.println(result);
        System.out.println(half.apply(9));

        Function<Integer, Double> halfTwo = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer / 2.0;
            }
        };

        List<User> users = Arrays.asList(
                new User("Alex", "Admin"),
                new User("Oleg", "member"),
                new User("Egor", "Admin"));

        List<String> nameList = process(users,user -> user.getName());
        System.out.println(nameList);

        List<String> roleList = process(users,user -> user.getRole());
        System.out.println(roleList);
    }

    public static List<String> process(List<User> users, Function<User, String> function) {
        List<String> newList = new ArrayList<>();
        for (User user : users) {
            newList.add(function.apply(user));
        }
        return newList;
    }
}
