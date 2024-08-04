package com.telran.prof.springlessons.lessonthirtyone.example.service;


import com.telran.prof.springlessons.lessonthirtyone.example.repository.WordRepository;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    private final WordRepository repository;

    public ExampleServiceImpl(WordRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getResult() {
        return repository.getWord();
    }
}
