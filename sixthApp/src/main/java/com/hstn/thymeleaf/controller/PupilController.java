package com.hstn.thymeleaf.controller;

import com.hstn.thymeleaf.model.Pupil;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PupilController {

    @GetMapping("/showPupilForm")
    public String showForm(Model model) {
//        Pupil pupil = new Pupil();
//        model.addAttribute("pupil", pupil);
        model.addAttribute("pupil", new Pupil());
        return "pupil_form";
    }
}
