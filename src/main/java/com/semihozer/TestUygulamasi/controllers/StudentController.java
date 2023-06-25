package com.semihozer.TestUygulamasi.controllers;


import com.semihozer.TestUygulamasi.service.abstracts.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    //Services to use
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
