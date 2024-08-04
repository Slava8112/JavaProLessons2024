package com.telran.prof.lesson.lessontwentyseven.exampleapp;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Box> boxes = new ArrayList<>();

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
