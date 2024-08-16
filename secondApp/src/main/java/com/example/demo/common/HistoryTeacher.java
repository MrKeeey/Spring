package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype") //тоже самое что ниже
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HistoryTeacher implements Teacher {

    public HistoryTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

// @PostConstruct Вызывается после создания конструктора
    @PostConstruct
    public void myFirstMethod() {
        System.out.println("myFirstMethod");
    }

// @PreDestroy Вызывается после завершения действия бина / завершение приложения
// Если класс обосначен @Scope("prototype") то @PreDestroy не вызывается
// @PreDestroy работает только с singleton классами
    @PreDestroy
    public void myLastMethod(){
        System.out.println("myLastMethod");
    }

    @Override
    public String assignHomework() {
        return "Изучаем историю 20 века";
    }
}
