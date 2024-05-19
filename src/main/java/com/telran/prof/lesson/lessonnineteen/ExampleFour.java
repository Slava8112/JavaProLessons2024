package com.telran.prof.lesson.lessonnineteen;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExampleFour {
    public static void main(String[] args) {
        String path = "text.txt";
        try {
            String infoFromFile = getInfoFromFile(path);
            System.out.println(infoFromFile);
        } catch (IOException exception) {
            System.out.println("Error with file");
        }
    }

    private static String getInfoFromFile(String path) throws IOException {

        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        return reader.readLine();

    }
}

