package com.semihozer.TestUygulamasi.controllers;

import com.semihozer.TestUygulamasi.entities.Teacher;
import com.semihozer.TestUygulamasi.service.abstracts.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    //Services to use
    TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getTeacherByUsername/{username}")
    public Teacher getTeacherByUsername(@PathVariable String username){
        return teacherService.getTeacherByUsername(username);
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createTeacher(@RequestBody Teacher teacher){
        teacherService.createTeacher(teacher);
    }
}
