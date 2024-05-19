package com.telran.prof.lesson.lessonnineteen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOne {
    public static void main(String[] args) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String s = reader.readLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
