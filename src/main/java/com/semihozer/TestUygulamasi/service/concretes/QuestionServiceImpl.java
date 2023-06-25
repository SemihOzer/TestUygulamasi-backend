package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.repositories.QuesitonRepository;
import com.semihozer.TestUygulamasi.service.abstracts.QuestionService;

public class QuestionServiceImpl implements QuestionService {

    private QuesitonRepository quesitonRepository;

    public QuestionServiceImpl(QuesitonRepository quesitonRepository) {
        this.quesitonRepository = quesitonRepository;
    }
}
