package com.semihozer.TestUygulamasi.controllers;


import com.semihozer.TestUygulamasi.entities.Student;
import com.semihozer.TestUygulamasi.service.abstracts.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    //Services to use
    private StudentService studentService;



    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping("/getStudentByUsername/{username}")
    public Student getStudentByUsername(@PathVariable String username){
        return studentService.getStudentByUserName(username);
    }


}
