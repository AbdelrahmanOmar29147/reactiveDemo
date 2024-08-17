package com.miro29147.reactivedemo.service;

import com.miro29147.reactivedemo.repositories.entity.Student;
import com.miro29147.reactivedemo.repositories.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Mono<Student> save(Student student) {
        return studentRepository.save(student);
    }

    public Flux<Student> findAll() {
        return studentRepository.findAll().delayElements(Duration.ofSeconds(2));
    }

    public Mono<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }
}
