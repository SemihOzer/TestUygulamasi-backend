package com.semihozer.TestUygulamasi.service.abstracts;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ResultService {

    void createResult(Result result);
    List<Result> getResultsByUsername(String username);
    List<Result> getResultByTestId(String testId);
    Result getResultById(String id);
}
