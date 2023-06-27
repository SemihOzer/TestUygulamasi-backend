package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.entities.Test;
import com.semihozer.TestUygulamasi.repositories.TestRepository;
import com.semihozer.TestUygulamasi.service.abstracts.TestService;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void createTest(Test test) {
        testRepository.save(test);
    }

    @Override
    public List<Test> getAllTest() {
        List<Test> tests = testRepository.findAll(Sort.by(Sort.Direction.DESC, "timestamp"));
        return tests;
    }

    @Override
    public List<Test> findAllTestByLevel(Integer level) {
        List<Test> tests = testRepository.findAllTestByLevel(level, Sort.by(Sort.Direction.DESC, "timestamp"));

        return tests;
    }

    @Override
    public List<Test> getTestsByNameRegEx(String name) {
        List<Test> tests = testRepository.getTestsByNameRegEx(name);
        return tests;
    }

}
