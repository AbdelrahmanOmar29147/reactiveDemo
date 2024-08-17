package com.miro29147.reactivedemo.repositories.repository;

import com.miro29147.reactivedemo.repositories.entity.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, Integer> {

    Flux<Student> findAllByFirstNameIgnoreCase(String firstName);
}
