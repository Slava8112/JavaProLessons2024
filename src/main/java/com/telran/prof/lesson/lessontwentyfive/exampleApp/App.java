package com.telran.prof.lesson.lessontwentyfive.exampleApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        Thread thread = new Thread(new Monitoring(strings));
        thread.setDaemon(true);
        thread.start();

        String data = null;
        while (!"exit".equals(data)) {
            System.out.println("Input city : ");
            data = scanner.next();
            strings.add(data);
        }
    }
}
