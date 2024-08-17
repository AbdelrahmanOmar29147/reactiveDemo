package com.miro29147.reactivedemo.repositories.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "student")
public class Student {

    private Integer Id;
    private String firstName;
    private String lastName;
    private String birthDate;
}
