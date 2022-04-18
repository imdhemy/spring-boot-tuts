package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                (new Student())
                        .setId(1L)
                        .setName("Mariam")
                        .setEmail("mariam@gmail.com")
                        .setDob(LocalDate.of(2000, 9, 9))
        );
    }
}
