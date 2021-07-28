package com.example.dtodemo.controller;

import com.example.dtodemo.converter.StudentConverter;
import com.example.dtodemo.dto.StudentDto;
import com.example.dtodemo.entity.Student;
import com.example.dtodemo.repository.StudentRepository;
import com.example.dtodemo.service.StudentService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentConverter studentConverter;

    @GetMapping("/get")
    public List<StudentDto> getAllStudents() {

        List<Student> getAllStudents=studentService .getAllStudents();
        return studentConverter.entityToDto(getAllStudents);
    }

    @GetMapping("/gets")
    public List<Student> getAllStudent() {

        return studentService.getAllStudent();
    }


//    @PostMapping("/post")
//    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
//
//        Student student= studentConverter.dtoToEntity(studentDto);
//        student= studentRepository.save(student);
//        return studentConverter.entityToDto(student);
//    }

    @PostMapping("/post")
    public long save(@Valid @RequestBody  Student student) {
        studentService.createStudent(student);
        return student.getId();
    }
}
