package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class WorkOutTeacher implements Teacher {
    public WorkOutTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String assignHomework() {
        return "Сегодня нужно сделать 100 приседаний";
    }
}
