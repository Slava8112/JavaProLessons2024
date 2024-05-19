package com.telran.prof.lesson.lessontwelve;
import java.util.*;
public class ExampleMapTwo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);  // a->100
        map.put("b", 200);  // b->200
        map.put("c", 300);  // c->300
        map.put("d", 400);  // d->400
        map.put("e", 400);  // d->400
        map.put("c", 50);

        Set<String> stringSet = map.keySet();
        Collection<Integer> values = map.values();

        Set<String> stringSetOne = new TreeSet<>();
        Map<String, Integer> mapTwo = new TreeMap<>();
        mapTwo.put("d", 100);  // a->100
        mapTwo.put("a", 200);  // b->200
        mapTwo.put("c", 300);  // c->300
        mapTwo.forEach((key, value) -> {
            System.out.println("" + key + " : " + value);
        });



    }
}

