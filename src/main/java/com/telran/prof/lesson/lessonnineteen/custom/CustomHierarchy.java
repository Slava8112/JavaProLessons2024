package com.telran.prof.lesson.lessonnineteen.custom;

public class CustomHierarchy {
    public static void main(String[] args) {
        try {
            one();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void one() {
        two();
    }

    private static void two()  {
        three();
    }

    private static void three()  {
        throw new BookNotFoundException("Hello");
    }
}
