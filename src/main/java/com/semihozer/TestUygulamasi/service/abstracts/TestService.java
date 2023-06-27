package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Test;

import java.util.List;

public interface TestService {

    void createTest(Test test);
    List<Test> getAllTest();

    List<Test> findAllTestByLevel(Integer level);

    List<Test> getTestsByNameRegEx(String name);
}
