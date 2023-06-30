package com.semihozer.TestUygulamasi.controllers;


import com.semihozer.TestUygulamasi.entities.Test;
import com.semihozer.TestUygulamasi.service.abstracts.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveTest(@RequestBody Test test){
        testService.createTest(test);
    }

    @GetMapping("/getAllTests")
    public List<Test> getAllTests(){
        return testService.getAllTest();
    }

    @GetMapping("/getTestsByLevel/{level}")
    public List<Test> getTestsByLevel(@PathVariable int level){
        return testService.findAllTestByLevel(level);
    }

    @GetMapping("/getTestsByName/{name}")
    public List<Test> getTestByName(@PathVariable String name){
        return testService.getTestsByNameRegEx(name);
    }

}
