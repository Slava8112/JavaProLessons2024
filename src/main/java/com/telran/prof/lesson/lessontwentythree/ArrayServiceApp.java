package com.telran.prof.lesson.lessontwentythree;

public class ArrayServiceApp {
    public static void main(String[] args) {
        int[]arr = {2,4,5,2,4,7,8,2,10,7,-4,9};
        ArrayService service = new ArrayService();

        System.out.println("Max element = " + service.findMax(arr));
        System.out.println("Min element = " + service.findMin(arr));
    }
}
