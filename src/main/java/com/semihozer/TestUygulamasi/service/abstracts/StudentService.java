package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Student;

public interface StudentService {
    void createStudent(Student student);
    Student getStudentById(String id);
    Student getStudentByUserName(String username);
}
