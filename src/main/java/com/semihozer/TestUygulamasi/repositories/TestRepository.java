package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test,String> {
}
