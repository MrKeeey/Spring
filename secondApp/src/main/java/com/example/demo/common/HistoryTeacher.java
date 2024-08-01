package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher {

    @Override
    public String assignHomework() {
        return "Изучаем историю 20 века";
    }
}
