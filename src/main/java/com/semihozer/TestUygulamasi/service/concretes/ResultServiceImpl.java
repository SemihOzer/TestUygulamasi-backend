package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.repositories.ResultRepository;
import com.semihozer.TestUygulamasi.service.abstracts.ResultService;

import javax.xml.transform.Result;

public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }
}
