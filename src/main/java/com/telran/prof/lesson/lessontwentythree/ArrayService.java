package com.telran.prof.lesson.lessontwentythree;

public class ArrayService {

    public int findMax(int[] arr){
        int max = arr[0];
        for (int i =0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public int findMin(int[] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException();
        }
        int min= arr[0];
        for (int i =0;i < arr.length;i++){
            min= Math.min(min,arr[i]);
        }
        return min;
    }
}
