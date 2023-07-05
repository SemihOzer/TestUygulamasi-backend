package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;
import com.semihozer.TestUygulamasi.repositories.ResultRepository;
import com.semihozer.TestUygulamasi.service.abstracts.ResultService;
import com.semihozer.TestUygulamasi.utilites.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository resultRepository;


    public ResultServiceImpl() {
    }

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
    public List<Result> getResultByTestId(String testId) {
        List<Result> results = resultRepository.findAllTestByTestId(testId);
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
