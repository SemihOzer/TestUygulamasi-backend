package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface TeacherService {

    Teacher getTeacherByUsername(String username);
    void createTeacher(Teacher teacher);

}
