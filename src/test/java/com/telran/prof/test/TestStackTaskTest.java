package com.telran.prof.test;

import com.telran.prof.lesson.lessoneleven.TestStackTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStackTaskTest {

    @Test
    void testDeleteDuplicateFromString(){
        TestStackTask task = new TestStackTask();
        String test = "addabchffh";
        String result = task.deleteDuplicate(test);
        //aabchh // bc
        assertEquals("bc", result);
    }
}