package com.telran.prof.lesson.lessontwelve;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class TestMap {
    public static void main(String[] args) {
        //List - ArrayList,LinkedList
        //Set  - TreeSet, HashSet
        //Queue - PriorityQueue, ArrayDeque, Stack

        //Map - (key,value)

        Map<String, Integer> map = new HashMap<>();
        //put time complexity O(1)
        map.put("a", 100);  // a->100
        map.put("b", 200);  // b->200
        map.put("c", 300);  // c->300
        map.put("d", 400);  // d->400
        map.put("e", 400);  // d->400
        map.put("c", 50);
        map.put(null, 600);



        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Key : " + key + " ; Value : " + value);
        }

        System.out.println();
        map.forEach((k, v) -> {
            System.out.println("Key : " + k + " ; Value : " + v);
        });

        //get time complexity O(1)
        Integer result = map.get("c");
        System.out.println("Result by key c is : " + result);

        boolean resultTwo = map.containsKey("e");
        System.out.println("Map contains key e is :" + resultTwo);


    }
}
