package com.telran.prof.lesson.lessonseventeen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ExampleFileWrite {
    public static void main(String[] args) {
        String pathToFile ="/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/fileOut.txt";
        String text = "Hello from Java Hello from Java";
        try {
            FileOutputStream fileOutputStream  = new FileOutputStream(pathToFile);

            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            for (byte temp : bytes){
                fileOutputStream.write(temp);
            }
            fileOutputStream.close();

        }catch (FileNotFoundException exception){
            System.out.println("Incorrect file path.Try again");
        } catch (Exception exception) {
        System.out.println("Error when access to file. Try again");
    }
    }
}
