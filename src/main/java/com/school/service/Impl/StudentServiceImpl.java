package com.school.service.Impl;

import com.school.models.Students;
import com.school.repos.StudentRepo;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public List<Students> getStudents(){
        Students s1 = new Students(1L,"Mohamed","mohamed@gmail.com");
        Students s2 = new Students(2L,"Ahmed","Ahmed@gmail.com");
        Students s3 = new Students(3L,"Esam","Esam@gmail.com");
        return Arrays.asList(s1,s2,s3);
    }

    @Override
    public Students createStudent() {
        Students s1 = new Students(1L,"Mohamed","mohamed@gmail.com");
        return studentRepo.save(s1);
    }
}
