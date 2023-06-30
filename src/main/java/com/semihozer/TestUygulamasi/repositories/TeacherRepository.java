package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface TeacherRepository extends MongoRepository<Teacher,String> {

    Teacher getTeacherByUsername(String username);

}
