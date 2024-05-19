package com.telran.prof.lesson.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10;i ++){
            list.add(i);
        }
        System.out.println("Elements :"+ list);

        //        нерабочий вариант
//        for (Integer element : list){
//            if (element % 2 ! = 0){
//                list.remove(element);
//            }
//        }

//        нерабочий вариант
//        for (int i = 0; i < 10; i ++){
//            if (list.get(i) % 2 !=0){
//                list.remove(i);
//            }
//        }

//        рабочий вариант
//        for (int i = 0; i < list.size(); i ++) {
//            if (list.get(i) % 2 != 0) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        Iterator<Integer > iterator = list.iterator();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            System.out.print(" " + current);
            if(current % 2 != 0) {
                iterator.remove();
            }
            }

        System.out.println();
        System.out.println(list);
    }
}
