package com.example.rest.API.service;

import com.example.rest.API.model.Student;
import com.example.rest.API.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepo;
    public Optional<Student> getStudentDetails(long id){
        Student student = studentRepo.findById(id).get();
        return Optional.of(student);
    }

    public Student createStudentDetails(Student student){
        studentRepo.save(student);
        return student;
    }
}
