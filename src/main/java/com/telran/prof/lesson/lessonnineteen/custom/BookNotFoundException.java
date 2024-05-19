package com.telran.prof.lesson.lessonnineteen.custom;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}
