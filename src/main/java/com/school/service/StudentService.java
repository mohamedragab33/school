package com.school.service;

import com.school.models.Students;

import java.util.List;


public interface StudentService {
    List<Students> getStudents();

    Students createStudent();
}
