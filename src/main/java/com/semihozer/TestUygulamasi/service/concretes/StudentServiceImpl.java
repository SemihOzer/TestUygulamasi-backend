package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.repositories.StudentRepository;
import com.semihozer.TestUygulamasi.service.abstracts.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
