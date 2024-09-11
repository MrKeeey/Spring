package com.meow.rest.my_controller;

import com.meow.rest.entity.Pupil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PupilRestController {

    @GetMapping("/pupils")
    public List<Pupil> getPupil() {
        Pupil pupil1 = new Pupil("Serg", "Pull");
        Pupil pupil2 = new Pupil("Oleg", "Petrov");
        Pupil pupil3 = new Pupil("Ivan", "Klizon");

        return List.of(pupil1, pupil2, pupil3);
    }


}
