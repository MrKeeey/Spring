package com.meow.rest.my_controller;

import com.meow.rest.entity.Pupil;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PupilRestController {
    private List<Pupil> pupils;

    @PostConstruct
    public void createListOfPupils() {
        pupils = new ArrayList<>();

        Pupil pupil1 = new Pupil("Serg", "Pull");
        Pupil pupil2 = new Pupil("Oleg", "Petrov");
        Pupil pupil3 = new Pupil("Ivan", "Klizon");

        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);
    }

    @GetMapping("/pupils")
    public List<Pupil> getPupil() {
        return pupils;
    }

    @GetMapping("/pupils/{pupilIndex}")
    public Pupil getPupilByIndexOfArrayList(@PathVariable int pupilIndex) {
    //second variant
//    public Pupil getPupilByIndexOfArrayList(@PathVariable(name = "pupilIndex") int id) {
        if (pupilIndex < 0 || pupilIndex >= pupils.size()) {
            throw new PupilNotFoundException("Pupil with id: " + pupilIndex + ", not found");
        }

        return pupils.get(pupilIndex);
    }

}
