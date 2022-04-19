package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = (new Student())
                    .setName("Mariam")
                    .setEmail("mariam@gmail.com")
                    .setDob(LocalDate.of(2000, Month.JANUARY, 9));

            Student alex = (new Student())
                    .setName("alex")
                    .setEmail("alex@gmail.com")
                    .setDob(LocalDate.of(2000, Month.JANUARY, 9));

            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
