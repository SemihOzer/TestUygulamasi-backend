package com.semihozer.TestUygulamasi.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Future;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document
public class Test {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String description;
    @Future
    private Date deadline;
    private Date timestamp;
    private List<Question> questions;
    private List<Student> students_solved;
    private List<Integer> answers;

    public Test() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Student> getStudents_solved() {
        return students_solved;
    }

    public void setStudents_solved(List<Student> students_solved) {
        this.students_solved = students_solved;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }

    public Test(String id, String name, String description, Date deadline, List<Question> questions, List<Student> students_solved, List<Integer> answers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.questions = questions;
        this.students_solved = students_solved;
        this.answers = answers;
    }
}
