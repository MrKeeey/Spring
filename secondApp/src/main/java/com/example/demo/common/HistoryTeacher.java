package com.example.demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype") тоже самое что ниже
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HistoryTeacher implements Teacher {

    public HistoryTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String assignHomework() {
        return "Изучаем историю 20 века";
    }
}
