package com.telran.prof.lesson.lessonfive;

public class TestCompare {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a == b){
            System.out.println("It is equals");
        }else {
            System.out.println("It is no equals");
        }
        //Class,array,String,Interface,Enum
        int[]arrayOne = {1,2,3};
        int[]arrayTwo = {1,2,3};
        if (arrayOne == arrayTwo){
            System.out.println("It is equals arrays");
        }else {
            System.out.println("It is no equals arrays");
        }
        String one = "Hello";
        String two = "Hello";
        if (one == two){
            System.out.println("It is equals string");
        }else {
            System.out.println("It is no equals string");
        }
        String three = new String("Hello");
        if (three == two){
            System.out.println("It is equals arrays");
        }else {
            System.out.println("It is no equals arrays");
        }
        if (one.equals(three)){
            System.out.println("It is equals string");
        }else {
            System.out.println("It is no equals string");
        }

    }
//    private static void checkString(String str){
//        if (str.equals("Hello")){
//            System.out.println("Hello! Hello");
//        }
//    }
}
