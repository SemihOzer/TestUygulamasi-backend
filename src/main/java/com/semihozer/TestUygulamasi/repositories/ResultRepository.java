package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultRepository extends MongoRepository<Result,String> {
}
