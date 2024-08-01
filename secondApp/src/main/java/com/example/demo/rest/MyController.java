package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//    зависимость через поле, устаревший вариант
//    @Autowired
    private Teacher teacher;

//      зависимость через конструктор
//    Если несколько классов, то нужно указать @Qualifier("historyTeacher")
//    где historyTeacher первая буква маленькая
    @Autowired
    public MyController(@Qualifier("historyTeacher") Teacher teacher) {
        this.teacher = teacher;
    }

//      зависимость через сеттер, а не конструктор
//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

//      зависимость через метод, а не конструктор
//    @Autowired
//    public void testMethod(Teacher teacher) {
//        this.teacher = teacher;
//    }

    @GetMapping("/homework")
    public String getHomework() {
        return teacher.assignHomework();
    }
}
