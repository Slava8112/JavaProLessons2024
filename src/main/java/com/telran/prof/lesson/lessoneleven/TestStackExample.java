package com.telran.prof.lesson.lessoneleven;

import java.util.Stack;

public class TestStackExample {
    public static void main(String[] args) {
        //LIFO - last input first output
        //FIFO - firs input first output

        Stack<String> stack = new Stack<>();
        //push - add element
        //pop - get element and remove
        //peek - get element without remove
        stack.push("I");
        stack.push("am");
        stack.push("student");

        //student//
        //  am   //
        //__I____//

        System.out.println("element am in position " + stack.search("student"));

        System.out.println(stack);
        String peek = stack.peek();
        System.out.println("element on the top of stack is :" + stack.peek());
        System.out.println(stack);

        String pop = stack.pop();
        System.out.println("Element from top is :" + pop);
        System.out.println(stack);
        System.out.println("element on the top of stack is :" + stack.peek());
    }
}
