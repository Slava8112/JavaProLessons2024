package com.telran.prof.lesson.lessonseventeen;

import java.io.File;

public class FilesExample {
    public static void main(String[] args) {
        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/file.txt";
        File file = new File(path);

        System.out.println("Is directory " + file.isDirectory());
        System.out.println("File exists " + file.exists());
    }
}
