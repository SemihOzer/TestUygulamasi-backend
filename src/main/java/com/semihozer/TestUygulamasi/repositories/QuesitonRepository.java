package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuesitonRepository extends MongoRepository<Question,String> {
}
