package com.telran.prof.lesson.lessonnineteen;

public class ExampleNine {
    public static void main(String[] args) {

        check(0);
        check(10);

    }
    private static void check(int n){
        try {
            int x = 10 / n;
            int y[] = new int[n];
            y[n] = 10;
        } catch (Exception exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println(exception instanceof ArithmeticException ?
                        "Can't divide by zero" : "Index does not exists");
            }if (exception instanceof IndexOutOfBoundsException)
                System.out.println("Index does not exists");

        }
    }
    //"Cant't divide by zero " , "Index does not exist"
    //
}
