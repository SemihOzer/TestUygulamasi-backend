package com.semihozer.TestUygulamasi.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Question {

    @Id
    private String id;
    private List<String> options;
    private int correct;

    public Question() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public Question(String id, List<String> options, int correct) {
        this.id = id;
        this.options = options;
        this.correct = correct;
    }
}
