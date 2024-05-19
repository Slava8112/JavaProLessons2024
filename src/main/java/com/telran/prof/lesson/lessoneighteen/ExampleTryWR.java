package com.telran.prof.lesson.lessoneighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleTryWR {
    public static void main(String[] args) {
        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessoneighteen/football.txt";
        // try - with - resources
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
