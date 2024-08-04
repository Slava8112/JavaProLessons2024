package com.telran.prof.lesson.lessontwentythree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        assertEquals(15,calculator.add(10,5));
    }
    @Test
    public void testSub(){
        assertEquals(8,calculator.sub(10,2));
    }
}