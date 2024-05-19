package com.telran.prof.lesson.lessonseventeen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ChangeOutExample {
    public static void main(String[] args) throws Exception {

        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/files";
        OutputStream fileOutputStream = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(fileOutputStream);

        System.setOut(printStream);
        System.out.println("Hello");
        System.out.println("Class");

    }
}
