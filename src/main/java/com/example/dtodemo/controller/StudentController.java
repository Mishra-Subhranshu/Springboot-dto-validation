package com.example.dtodemo.controller;

import com.example.dtodemo.converter.StudentConverter;
import com.example.dtodemo.dto.StudentDto;
import com.example.dtodemo.entity.Student;
import com.example.dtodemo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentConverter studentConverter;

    @GetMapping("/get")
    public List<StudentDto> getAllStudents() {

        List<Student> getAllStudents = studentService.getAllStudents();
        return studentConverter.entityToDto(getAllStudents);
    }

    @GetMapping("/gets")
    public List<Student> getAllStudent() {

        return studentService.getAllStudent();
    }


    @PostMapping("/post")
    public long save(@Valid @RequestBody Student student) {
        studentService.createStudent(student);
        return student.getId();
    }

//    @PostMapping("/demo")
//    protected ResponseEntity<Object> handleMethodArgumentNotValid( @Valid @RequestBody Student student,
//                                                                   MethodArgumentNotValidException ex,
//                                                                  HttpHeaders headers,
//                                                                  HttpStatus status,
//                                                                  WebRequest request,
//                                                                   BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            Map<String, String> errors = new HashMap<>();
//            ex.getBindingResult().getAllErrors().forEach((error) -> {
//
//                String fieldName = ((FieldError) error).getField();
//                String message = error.getDefaultMessage();
//                errors.put(fieldName, message);
//            });
//            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//        }
//        studentService.createStudent(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}

