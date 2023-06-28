package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;

import java.util.List;

public interface ResultService {

    void createResult(Result result);
    List<Result> getResultsByUsername(String username);
    List<Result> getResultsByLevel(int level);
    List<Result> getResultByTest(Test test);
    Result getResultById(String id);
}
