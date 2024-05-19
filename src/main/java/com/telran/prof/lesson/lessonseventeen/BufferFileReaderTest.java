package com.telran.prof.lesson.lessonseventeen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferFileReaderTest {
    public static void main(String[] args) {
        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/file.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            reader.lines().forEach(line -> System.out.println());
            reader.close();
            inputStreamReader.close();
            fileInputStream.close();

        }catch (Exception exception){
            System.out.println("Problem with file " + exception.getMessage());
        }
    }
}
