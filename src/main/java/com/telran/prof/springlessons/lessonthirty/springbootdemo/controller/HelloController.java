package com.telran.prof.springlessons.lessonthirty.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//HTTP
//GET
//POST
//DELETE
//PUT


//http://localhost:8080/
@RestController
public class HelloController {

    @GetMapping  // //http://localhost:8080/ GET
    public String printHello() {
        return "Hello! Java! World!";
    }
}
