package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.entities.Teacher;
import com.semihozer.TestUygulamasi.repositories.TeacherRepository;
import com.semihozer.TestUygulamasi.service.abstracts.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherServiceImpl() {
    }

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher getTeacherByUsername(String username) {
        Teacher teacher = teacherRepository.getTeacherByUsername(username);
        return teacher;
    }

    @Override
    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
