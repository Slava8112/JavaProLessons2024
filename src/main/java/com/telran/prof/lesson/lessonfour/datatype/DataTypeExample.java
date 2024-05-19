package com.telran.prof.lesson.lessonfour.datatype;

public class DataTypeExample {

    public static void main(String[] args) {
        // int, byte, short, char, long, double , float, boolean - primitive type
        // String,Class, Interface, Enum,Array - reference data types

        int count = 10;
        System.out.println("Count = " + count);         // incCount//
        incCount(count);     // incCount(10)            // main    //
        System.out.println("New count = " + count);     // ------- //

        count = incCountTwo(count);
        System.out.println("New count after call intCountTwo " + count);
    }

    private static void incCount(int count) {
        //int count = 10;
        System.out.println("Count from method before " + count);
        count = count + 1;
        System.out.println("Count from method after "+ count);
    }

    private static int incCountTwo(int count) {
        //int count = 10;
        System.out.println("Count from method before " + count);
        count = count + 1;
        System.out.println("Count from method after "+ count);
        return count;
    }
}