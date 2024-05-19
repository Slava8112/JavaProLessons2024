package com.telran.prof.lesson.lessonseven.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MyList {

    private String[] elements;

    public MyList(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor < elements.length;
        }

        @Override
        public String next() {
            int i = cursor;
            cursor = i + 2;
            return elements[i];


//            cursor = 0;
//            for (cursor = 0;cursor< elements.length;cursor ++ )
//                System.out.println(" ");
//            return null;
        }
    }
}
