package com.telran.prof.lesson.lessontwentyone.generics;

public interface Converter <Entity ,Dto>{
    Dto toDto(Entity entity);
    Entity toEntity(Dto dto);

}
