package com.telran.prof.lesson.lessonseventeen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleFileRead {
    public static void main(String[] args) {
        //try{
        //problems
        // } catch (Exception e){
        // handle exception
        // }

        String pathToFile = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessonseventeen/file.txt";


        try {
            FileInputStream fileInputStream  = new FileInputStream(pathToFile);

            while (fileInputStream.available() > 0){
                int read = fileInputStream.read();
                System.out.print(" " + (char)read);
            }
//            int read = fileInputStream.read();
//            System.out.println((char) read + " available bytes " + fileInputStream.available());
//            read = fileInputStream.read();
//            System.out.println((char) read  + " available bytes " + fileInputStream.available());
//            read = fileInputStream.read();
//            System.out.println((char) read  + " available bytes " + fileInputStream.available());
//            fileInputStream.available();
            fileInputStream.close();
        }catch (Exception exception) {
            System.out.println("Incorrect file path.Try again");
        }
        System.out.println();
        System.out.println("End of application");
    }
}
