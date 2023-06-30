package com.semihozer.TestUygulamasi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Student {

    @Id
    private String id;
    @Indexed(unique=true)
    private String username;
    private String password;
    private String fullName;

    private List<Result> results;

    public Student() {
    }

    public Student(String id, String username, String password, String fullName, List<Result> results) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.results = results;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
