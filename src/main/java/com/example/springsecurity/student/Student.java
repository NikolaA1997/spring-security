package com.example.springsecurity.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {

    private final Integer studentId;
    private final String studentName;
}
