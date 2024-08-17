package com.miro29147.reactivedemo.service;

import com.miro29147.reactivedemo.repositories.entity.Student;
import com.miro29147.reactivedemo.repositories.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Mono<Student> save(Student student){
        return studentRepository.save(student);
    }

    public Flux<Student> findAll(){
        return studentRepository.findAll();
    }

    public Mono<Student> findById(Integer id){
        return studentRepository.findById(id);
    }
}
