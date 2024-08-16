package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Lazy
@RestController
public class MyController {

//    зависимость через поле, устаревший вариант
//    @Autowired
    private Teacher teacher;
//    private Teacher secondTeacher;

//      зависимость через конструктор
//    Если несколько классов, то нужно указать @Qualifier("historyTeacher")
//    где historyTeacher первая буква маленькая
//    @Autowired
//    public MyController(@Qualifier("historyTeacher") Teacher teacher) {
//        this.teacher = teacher;
//    }

// Аннотация @Qualifier имеет больший приоритет чем @Primary
    @Autowired
    public MyController(@Qualifier("bestTeacher") Teacher teacher) {
        this.teacher = teacher;
//        this.secondTeacher = secondTeacher;
        System.out.println("Bean of class - " + this.getClass());
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

// Для теста @Scope
//    @GetMapping("/compareTeachers")
//    public String compareTeachers(){
//        return "First teacher - " + teacher + "....." +
//                "Second teacher - " + secondTeacher + "....." +
//                "Compare teachers - " + (teacher == secondTeacher);
//    }
}
