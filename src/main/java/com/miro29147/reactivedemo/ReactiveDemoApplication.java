package com.miro29147.reactivedemo;

import com.miro29147.reactivedemo.repositories.entity.Student;
import com.miro29147.reactivedemo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveDemoApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(StudentService studentService) {
//        return args -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("hello: " + i);
//                studentService.save(
//                        Student.builder()
//                                .firstName("Boojoo" + i)
//                                .lastName("Beedo" + i)
//                                .birthDate("21/7/1999")
//                                .build()
//                ).subscribe();
//            }
//        };
//    }

}
