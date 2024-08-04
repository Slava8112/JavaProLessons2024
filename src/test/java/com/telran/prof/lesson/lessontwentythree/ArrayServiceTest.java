package com.telran.prof.lesson.lessontwentythree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayServiceTest {
    private ArrayService service = new ArrayService();

    @Test
    public void testMax(){
        int[] arr = {1,2,4,6,0};
        assertEquals(6,service.findMax(arr));
    }
    @Test
    public void testMin() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(0, service.findMin(arr));
    }

    @Test
    public void testMinWhenArrayIsEmpty(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class,
                () -> service.findMin(new int[0]));
    }
    @Test
    public void testMaxWhenArrayIsEmpty(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class,

    }