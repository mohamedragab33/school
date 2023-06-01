package com.school.controllers;


import com.school.models.Students;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping
    public ResponseEntity<List<Students>> getStudents(){
        return ResponseEntity.ok(studentService.getStudents());

    }

    @PostMapping("/create")
    public ResponseEntity<Students> createStudent(){
        return ResponseEntity.ok(studentService.createStudent());

    }

}
