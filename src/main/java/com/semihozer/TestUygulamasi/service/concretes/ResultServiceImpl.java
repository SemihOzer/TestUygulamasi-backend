package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;
import com.semihozer.TestUygulamasi.repositories.ResultRepository;
import com.semihozer.TestUygulamasi.service.abstracts.ResultService;
import com.semihozer.TestUygulamasi.utilites.exceptions.NotFoundException;

import java.util.List;
import java.util.Optional;

public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public void createResult(Result result) {
        resultRepository.save(result);
    }

    @Override
    public List<Result> getResultsByUsername(String username) {
        List<Result> results = resultRepository.findAllTestByUsername(username);
        return results;
    }

    @Override
    public List<Result> getResultsByLevel(int level) {
        List<Result> results = resultRepository.findAllTestByLevel(level);
        return results;
    }

    @Override
    public List<Result> getResultByTest(Test test) {
        List<Result> results = resultRepository.findAllTestByTest(test);
        return results;
    }

    @Override
    public Result getResultById(String id) {
        Optional<Result> result = resultRepository.findById(id);

        if(result.isEmpty()){
            throw new NotFoundException("Result Id: "+id+" not found!");
        }

        return result.get();
    }
}
