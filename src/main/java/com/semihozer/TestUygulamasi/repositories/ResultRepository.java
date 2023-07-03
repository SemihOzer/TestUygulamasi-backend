package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;



public interface ResultRepository extends MongoRepository<Result,String> {
    List<Result> findAllTestByUsername(String username);
    List<Result> findAllTestByTest(Test test);
}
