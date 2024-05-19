package com.telran.prof.lesson.lessonseventeen;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class BufferedExample {
    public static void main(String[] args) {
        String pathToFile = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/file.txt";
        try {
            InputStream fileInputStream = new FileInputStream(pathToFile);

            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            System.out.println(scanner.next());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
