package com.telran.prof.lesson.lessonnineteen;
import java.io.*;
public class ExampleSeven {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt"); //FileNF
            BufferedReader reader = new BufferedReader(fileReader);
            String s = reader.readLine(); // IOException
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { //IOException, FileNotFoundException
            e.printStackTrace();
        } catch (Exception exception) { //Exception, extends Exception
            exception.printStackTrace();
        }
    }
}
