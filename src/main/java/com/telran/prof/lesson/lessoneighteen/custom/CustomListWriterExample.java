package com.telran.prof.lesson.lessoneighteen.custom;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CustomListWriterExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "SQL");
        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessoneighteen/outout.txt";

        Writer customListWriter = new CustomListWriter(path);
        strings.stream().forEach(s -> {
            try {
                customListWriter.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
