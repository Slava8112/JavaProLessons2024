package com.telran.prof.lesson.lessoneighteen;

public class TestTRC {
    public static void main(String[] args) {
        // try - catch
        // try - catch - finally(код внутри этого блока будет выполнен всегда)
        // try - finally
        // try - catch - catch .etc
        // try() - и блоки вышеуказанные

        int[] array = {1, 3, 4, 5, 6};

        try {
            System.out.println(array[10]);
        } catch (Exception e) {
            System.out.println("Handle exception from catch block");
        } finally {
            System.out.println("Handle and execute code from finally block");
        }

        System.out.println(getInt());

        check(5, 6, 7, 8, 9, 0,8,9,9,0,0,0,8,0);
    }

    private static int getInt() {
        try {
            return 5;
        } catch (Exception e) {
            return 10;
        } finally {
            return 15;
        }
    }

    private static void check(int... array) {
        try {
            System.out.println("Get array element = " + array[10]);
            //System.exit(0);
            return;
        } catch (Exception exception) {
            System.out.println("Handle exception from catch");
            return;
        } finally {
            System.out.println("Execution from finally block");
        }

        // System.out.println("end of method");
    }
}
