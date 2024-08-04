package com.telran.prof.springlessons.lessonthirty.springbootdemo.controller;

import com.telran.prof.springlessons.lessonthirty.springbootdemo.model.Coffee;
import com.telran.prof.springlessons.lessonthirty.springbootdemo.sevice.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//GET
//POST

//http://localhost:8080/coffees
@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    //http://localhost:8080/coffees
    @GetMapping
    public Set<Coffee> getAll() {
        return coffeeService.getAll();
    }

    //http://localhost:8080/coffees/713183bb-9593-4b8c-9e52-704fa8b7bee3"
    @GetMapping("/{uuid}")
    public Coffee getById(@PathVariable String uuid) {
        return coffeeService.getById(uuid);
    }

    //http://localhost:8080/coffees
    @PostMapping
    public Coffee add(@RequestBody Coffee coffee) {
        return coffeeService.add(coffee);
    }
}
