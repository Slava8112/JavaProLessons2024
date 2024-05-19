package com.telran.prof.lesson.lessoneleven;

import java.util.Stack;

public class TestStackTask {
    public static void main(String[] args) {
        String test = "addabchffh";
        //aabchh  // bc
        TestStackTask task = new TestStackTask();
        String result = task.deleteDuplicate(test);
        System.out.println(result);
    }

    public String deleteDuplicate(String original) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            char temp = original.charAt(i);
            if (stack.isEmpty()) {
                stack.push(temp);
            } else {
                char top = stack.peek();
                if (top == temp) {
                    stack.pop();
                } else {
                    stack.push(temp);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            char element = stack.pop();
            stringBuilder.append(element);
        }
        return stringBuilder.reverse().toString();
    }
}
