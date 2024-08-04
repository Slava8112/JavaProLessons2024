package com.telran.prof.springlessons.lessonthirtyone.example;

import com.telran.prof.springlessons.lessonthirtyone.example.controller.ExampleController;
import com.telran.prof.springlessons.lessonthirtyone.example.repository.SimpleWordRepository;
import com.telran.prof.springlessons.lessonthirtyone.example.service.ExampleServiceImpl;

public class ExampleApp {

    public static void main(String[] args) {
        SimpleWordRepository simpleWordRepository = new SimpleWordRepository();
        ExampleServiceImpl exampleService = new ExampleServiceImpl(simpleWordRepository);
        ExampleController exampleController = new ExampleController(exampleService);

        String example = exampleController.example();
        System.out.println(example);

        //USER - CONTROLLER -> SERVICE - >(DB) -> SERVICE -> CONTROLLER -> USER
    }
}
