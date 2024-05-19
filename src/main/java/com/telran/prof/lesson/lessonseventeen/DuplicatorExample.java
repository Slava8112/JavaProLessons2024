package com.telran.prof.lesson.lessonseventeen;

public class DuplicatorExample {
    public static void main(String[] args) {
        String catalog = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/files";
        Duplicator duplicator = new Duplicator(catalog);
        duplicator.duplicate("SoutExample.java", "text.txt");
    }
}
