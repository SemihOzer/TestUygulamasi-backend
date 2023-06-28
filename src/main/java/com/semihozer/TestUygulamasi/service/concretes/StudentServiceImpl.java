package com.semihozer.TestUygulamasi.service.concretes;

import com.semihozer.TestUygulamasi.entities.Student;
import com.semihozer.TestUygulamasi.repositories.StudentRepository;
import com.semihozer.TestUygulamasi.service.abstracts.StudentService;
import com.semihozer.TestUygulamasi.utilites.exceptions.NotFoundException;

import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isEmpty()){
            throw new NotFoundException("Student Id: "+id+" not found!");
        }

        return student.get();

    }

    @Override
    public Student getStudentByUserName(String username) {

        Student student = studentRepository.getStudentByUsername(username);
        return student;

    }
}
