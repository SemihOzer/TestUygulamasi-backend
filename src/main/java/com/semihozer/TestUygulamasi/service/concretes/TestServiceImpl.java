package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.repositories.TestRepository;
import com.semihozer.TestUygulamasi.service.abstracts.TestService;

public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
}
