package com.telran.prof.lesson.lessonfifteen;
import java.util.Arrays;
import java.util.List;
public class ExampleOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (Integer element : integerList) {
            if( element % 2 == 0) {
                System.out.println(element);
            }
        }

        integerList.stream().filter(element -> element % 2 == 0)
                .forEach(integer -> System.out.print(" " + integer));

        //integerList -> 1,2,3,4,5,6,7,8-> 2,4,6,8 ->  2 4 6 8

        // Data structure
        //.
        // stream
        //.
        //на входе и на выходе промежуточной операции - стрим!!!
        // intermediate
        //.
        // intermediate
        // .....
        // intermediate
        //.
        // terminal (end of stream )
    }
}
