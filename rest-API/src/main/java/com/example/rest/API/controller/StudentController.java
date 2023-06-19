package com.example.rest.API.controller;

import com.example.rest.API.model.Student;
import com.example.rest.API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/student/{id}")
        public ResponseEntity<Student> getStudentDetails(@PathVariable long id) {
            Optional<Student> student = studentService.getStudentDetails(id);
            if(student.)
            return new ResponseEntity<>(student, HttpStatus.OK);

    }

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

    }


}
