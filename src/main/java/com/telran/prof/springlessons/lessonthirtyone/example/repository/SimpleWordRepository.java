package com.telran.prof.springlessons.lessonthirtyone.example.repository;

public class SimpleWordRepository implements WordRepository {

    @Override
    public String getWord() {
        return "Hello from repo";
    }
}
