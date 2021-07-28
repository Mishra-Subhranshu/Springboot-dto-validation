package com.example.dtodemo.service;

import com.example.dtodemo.entity.Student;
import com.example.dtodemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }

    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }



    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

//    @Override
//    public Student getStudentById(long id) {
//        return studentRepository.findById(id).get();
//    }
//
//    @Override
//    public void deleteStudent(long id) {
//        studentRepository.deleteById(id);
//
//    }
}
