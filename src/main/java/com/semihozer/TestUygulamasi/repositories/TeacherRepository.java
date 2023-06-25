package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,String> {
}
