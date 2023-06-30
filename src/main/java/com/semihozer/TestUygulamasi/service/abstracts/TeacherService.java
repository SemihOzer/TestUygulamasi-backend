package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {

    Teacher getTeacherByUsername(String username);
    void createTeacher(Teacher teacher);

}
