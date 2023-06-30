package com.semihozer.TestUygulamasi.controllers;

import com.semihozer.TestUygulamasi.entities.Result;
import com.semihozer.TestUygulamasi.entities.Test;
import com.semihozer.TestUygulamasi.service.abstracts.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {


    ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void createResult(@RequestBody Result result){
        resultService.createResult(result);
    }

    @GetMapping("/getResultsByUsername/{username}")
    public List<Result> getResultsByUsername(@PathVariable String username){
        return resultService.getResultsByUsername(username);
    }

    @GetMapping("/getResultsByTest")
    public List<Result> getResultsByTest(@RequestBody Test test){
        return resultService.getResultByTest(test);
    }

    @GetMapping("/getResultById/{id}")
    public Result getResultById(@PathVariable String id){
        return resultService.getResultById(id);
    }

}
