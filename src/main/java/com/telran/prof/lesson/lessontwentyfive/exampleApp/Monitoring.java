package com.telran.prof.lesson.lessontwentyfive.exampleApp;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Monitoring implements Runnable{
    private List<String> strings;

    public Monitoring(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        String path ="/home/slava/IdeaProjects/JavaPro2024/src/main/java/com/telran/prof/lesson/lessontwentyfive/exampleOne/text.txt";
        FileWriter writer= null;
        try {
            writer = new FileWriter(path);
        } catch (IOException e) {
            System.out.println("Incorrect path " + path);
            return;
        }

        while (true) {
            sleep();
            StringBuilder sb = new StringBuilder();
            sb.append(LocalDateTime.now());
            sb.append(" - ").append("count of cities ").append(strings.size()).append("\n");

            try {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
