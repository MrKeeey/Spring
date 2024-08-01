package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class WorkOutTeacher implements Teacher {

    @Override
    public String assignHomework() {
        return "Сегодня нужно сделать 100 приседаний";
    }
}
