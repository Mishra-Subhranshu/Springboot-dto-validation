package com.example.dtodemo.converter;

import com.example.dtodemo.dto.StudentDto;
import com.example.dtodemo.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {

    public StudentDto entityToDto(Student student)
        {
            StudentDto dto = new StudentDto();
            dto.setId(student.getId());
            dto.setRollNo(student.getRollNo());
            dto.setMobileNo(student.getMobileNo());
            dto.setEmail(student.getEmail());
            dto.setFirstName(student.getFirstName());
            dto.setLastName(student.getLastName());
            dto.setCollageName(student.getCollageName());
            return dto;
        }

    public List<StudentDto> entityToDto(List<Student> students) {
        return students.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
    }


    public Student dtoToEntity(StudentDto dto) {

        Student st = new Student();
        st.setId(dto.getId());
        st.setRollNo(dto.getRollNo());
        st.setMobileNo(dto.getMobileNo());
        st.setEmail(dto.getEmail());
        st.setFirstName(dto.getFirstName());
        st.setLastName(dto.getLastName());
        st.setCollageName(dto.getCollageName());
        return st;
    }

    public List<Student> dtoToEntity(List<StudentDto> dtos) {
        return dtos.stream().map(x-> dtoToEntity(x)).collect(Collectors.toList());
    }

}
