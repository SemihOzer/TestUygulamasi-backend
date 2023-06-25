package com.semihozer.TestUygulamasi.entities;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Teacher {

    @Id
    @GeneratedValue
    private String id;
    private String username;
    private String password;
    private List<Test> tests;

    public Teacher() {
    }

    public Teacher(String id, String username, String password, List<Test> tests) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tests = tests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
