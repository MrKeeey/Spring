package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class LaberTeacher implements Teacher {

    @Override
    public String assignHomework() {
        return "Сегодня делаем стул";
    }
}
