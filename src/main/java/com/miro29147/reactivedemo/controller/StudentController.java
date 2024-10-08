package com.miro29147.reactivedemo.controller;

import com.miro29147.reactivedemo.repositories.entity.Student;
import com.miro29147.reactivedemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    Mono<Student> save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Student> findAll() throws InterruptedException {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    Mono<Student> findById(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }
}
