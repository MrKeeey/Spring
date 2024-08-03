package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Только 1 класс может быть Primary
public class LaborTeacher implements Teacher {

    @Override
    public String assignHomework() {
        return "Сегодня делаем стул";
    }
}
