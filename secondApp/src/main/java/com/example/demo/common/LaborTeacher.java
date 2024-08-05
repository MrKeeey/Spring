package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Primary
//Только 1 класс может быть Primary
public class LaborTeacher implements Teacher {
    public LaborTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String assignHomework() {
        return "Сегодня делаем стул";
    }
}
