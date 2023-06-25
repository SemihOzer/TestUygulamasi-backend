package com.semihozer.TestUygulamasi.entities;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Result {

    @Id
    @GeneratedValue
    private String id;

    private List<Integer> corrects;
    private List<Integer> fails;
    private List<Integer> misses;
    private Student student;
    private Test test;

    public Result() {

    }

    public Result(String id, List<Integer> corrects, List<Integer> fails, List<Integer> misses, Student student, Test test) {
        this.id = id;
        this.corrects = corrects;
        this.fails = fails;
        this.misses = misses;
        this.student = student;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
