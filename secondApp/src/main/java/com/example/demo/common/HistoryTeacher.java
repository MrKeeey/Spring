package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class HistoryTeacher implements Teacher {

    public HistoryTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String assignHomework() {
        return "Изучаем историю 20 века";
    }
}
