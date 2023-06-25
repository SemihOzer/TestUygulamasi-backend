package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.repositories.TeacherRepository;
import com.semihozer.TestUygulamasi.service.abstracts.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
}
