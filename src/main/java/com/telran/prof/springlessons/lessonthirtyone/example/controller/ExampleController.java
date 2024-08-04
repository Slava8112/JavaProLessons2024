package com.telran.prof.springlessons.lessonthirtyone.example.controller;

import com.telran.prof.springlessons.lessonthirtyone.example.service.ExampleService;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleController {

    private final ExampleService exampleService ;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public String example() {
        String result = exampleService.getResult();
        return result;
    }
}
