package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TestRepository extends MongoRepository<Test,String> {
    List<Test> findAllTestByLevel(Integer level, Sort sort);
    @Query("{ name : { $regex : ?0, $options: 'i' } }")
    List<Test> getTestsByNameRegEx(String name);
}
