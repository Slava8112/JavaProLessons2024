package com.telran.prof.lesson.lessonseven;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D","E");

        Iterator<String> iterator = list.iterator();
        System.out.println("List os elements : ");
//        String elementOne = iterator.next();
//        String elementTwo = iterator.next();
//        System.out.println(elementOne);
//        System.out.println(elementTwo);
        // ->A B C D E
        //next(); // A
        // A -> B C D E
        //next() // B
        //A B -> C D E
        //next() // C
        // A B C  -> D E
        //next() // D
        //A B C D ->E
        //next() //E
        // A B C D E ->
        boolean b = iterator.hasNext();

        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.print(" " + current);
        }
        String next = iterator.next();

//        ArrayList<Objects> arrayList = new ArrayList();
//        new LinkedList<>();
    }
}
