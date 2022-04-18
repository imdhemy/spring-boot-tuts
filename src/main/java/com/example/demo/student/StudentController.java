package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> index() {
        return List.of(
                (new Student())
                        .setId(1L)
                        .setName("Mariam")
                        .setEmail("mariam@gmail.com")
                        .setDob(LocalDate.of(2000, 9, 9))
        );
    }
}
