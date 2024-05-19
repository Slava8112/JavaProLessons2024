package com.telran.prof.lesson.lessoneighteen;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class ParserExample {
    public static void main(String[] args) {

        String path = "/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessoneighteen/football.txt";
        List<Match> matches = new ArrayList<>();
        try {
            FileInputStream stream = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(stream);


//            int data = reader.read();
//                StringBuilder stringBuilder = new StringBuilder();
//                        while (data != -1){
//                if (data != '\n'){
//                    stringBuilder.append((char) data);
//                }else {
//                    String s = stringBuilder.toString();
//                    System.out.println(s);
//                }
//                data = reader.read();
//            }


//            char[] buff = new char[512];
//            while (reader.ready()){
//                int read = reader.read(buff);
//                System.out.print(Arrays.toString(buff));
//            }


            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split(", ");

                Match match = new Match(
                        new GregorianCalendar(Integer.parseInt(split[0]),
                                Integer.parseInt(split[1]),
                                Integer.parseInt(split[2])),
                        split[3],
                        split[5],
                        split[4],
                        "NULL".equals(split[6]) ? 0 : Integer.parseInt(split[6]),
                        split[7]);
                matches.add(match);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("Count of matches " + matches.size());
        System.out.println(matches);

    }

}