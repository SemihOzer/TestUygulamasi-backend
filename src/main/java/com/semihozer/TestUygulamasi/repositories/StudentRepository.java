package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends MongoRepository<Student,String> {

    Student getStudentByUsername(String username);

}
