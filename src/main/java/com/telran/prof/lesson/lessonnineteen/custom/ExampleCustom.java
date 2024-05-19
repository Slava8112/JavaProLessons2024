package com.telran.prof.lesson.lessonnineteen.custom;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExampleCustom {
    public static void main(String[] args) {
        System.out.println("Please input book name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        BookShelf bookShelf = new BookShelf();
        try {
            Book book = bookShelf.searchByName(name);
            System.out.println(book);
        } catch (BookNotFoundException | IncorrectBookNameException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Try again");
        }
    }
}
