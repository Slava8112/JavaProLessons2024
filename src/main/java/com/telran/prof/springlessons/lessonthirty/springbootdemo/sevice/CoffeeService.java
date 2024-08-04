package com.telran.prof.springlessons.lessonthirty.springbootdemo.sevice;

import com.telran.prof.springlessons.lessonthirty.springbootdemo.model.Coffee;

import java.util.Set;

public interface CoffeeService {

    Set<Coffee> getAll();

    Coffee getById(String uuid);

    Coffee add(Coffee coffee);
}