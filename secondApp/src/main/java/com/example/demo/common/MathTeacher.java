package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Lazy
public class MathTeacher implements Teacher {
    public MathTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String assignHomework() {
        /*List<String> homework = new ArrayList<>();
        homework.add("2 + 2 = ?");
        homework.add("3 * 2 = ?");
        return homework.toString();*/
        return "2 + 2 = ?";
    }
}
