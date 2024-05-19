package com.telran.prof.lesson.lessonnineteen;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExampleFive {
    public static void main(String[] args)  {
        String path = "text.txt";
        try {
            readFile(path);
        } catch (IOException exception) {
            System.out.println("Please check file " + path);
        }
    }

    private static void readFile(String path) throws IOException {
        getInfoFromFile(path);
    }

    private static String getInfoFromFile(String path) throws IOException {

        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        return reader.readLine();

    }
}
