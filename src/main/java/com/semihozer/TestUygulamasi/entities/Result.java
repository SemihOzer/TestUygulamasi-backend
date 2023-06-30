package com.semihozer.TestUygulamasi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Result {

    @Id
    private String id;

    private List<Integer> corrects;
    private List<Integer> fails;
    private List<Integer> misses;
    private String username;
    private Test test;

    public Result() {

    }

    public Result(String id, List<Integer> corrects, List<Integer> fails, List<Integer> misses, String username, Test test) {
        this.id = id;
        this.corrects = corrects;
        this.fails = fails;
        this.misses = misses;
        this.username = username;
        this.test = test;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getCorrects() {
        return corrects;
    }

    public void setCorrects(List<Integer> corrects) {
        this.corrects = corrects;
    }

    public List<Integer> getFails() {
        return fails;
    }

    public void setFails(List<Integer> fails) {
        this.fails = fails;
    }

    public List<Integer> getMisses() {
        return misses;
    }

    public void setMisses(List<Integer> misses) {
        this.misses = misses;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
