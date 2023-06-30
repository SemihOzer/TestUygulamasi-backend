package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Teacher;

public interface TeacherService {

    Teacher getTeacherByUsername(String username);
    void createTeacher(Teacher teacher);

}
