package com.example.demo.common;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MathTeacher implements Teacher {

    @Override
    public String assignHomework() {
        /*List<String> homework = new ArrayList<>();
        homework.add("2 + 2 = ?");
        homework.add("3 * 2 = ?");
        return homework.toString();*/
        return "2 + 2 = ?";
    }
}
