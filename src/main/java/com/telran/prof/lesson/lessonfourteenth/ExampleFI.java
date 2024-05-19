package com.telran.prof.lesson.lessonfourteenth;
import java.util.Comparator;
public class ExampleFI {
    public static void main(String[] args) {
        Printable printer = new Printer();
        printer.print("Alex");

        Printable upperPrinter = new UpperPrinter();
        upperPrinter.print("Oleg");

        Printable printerTwo = new Printable() {
            @Override
            public void print(String text) {
                System.out.println("Hello hello " + text);
            }
        };

        printerTwo.print("Max");

        Printable lowerCasePrinter = text -> System.out.println(text.toLowerCase());

        lowerCasePrinter.print("Egor");

        CustomPrintable customPrinter = new CustomPrintable() {
            @Override
            public void printInfo(String text1, String text2) {
                System.out.println("info " + text1 + " add info " + text2);
                System.out.println(" text 1" + text1);
                System.out.println(" text 2" + text2);
            }
        };
        CustomPrintable customPrinterTwo = (v1, v2) -> {
            System.out.println("info " + v1 + " add info " + v2);
            System.out.println(" text 1" + v1);
            System.out.println(" text 2" + v2);
        };
        customPrinterTwo.printInfo("Hello1","Hello2");

        CustomPrintableTwo customPrintableTwo = new CustomPrintableTwo() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        CustomPrintableTwo customPrintableTwoLambda = () -> System.out.println("Hello");

    }
}
