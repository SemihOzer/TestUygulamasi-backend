package com.semihozer.TestUygulamasi.repositories;

import com.semihozer.TestUygulamasi.entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface QuesitonRepository extends MongoRepository<Question,String> {
}
