package com.example.dtodemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentDto {

    @JsonProperty(value = "stud_id")
    private long id;

    @JsonProperty(value = "stud_rollNo")
    private String rollNo;

    private String mobileNo;

    @JsonProperty(value = "stud_email")
    private String email;

    @JsonProperty(value = "stud_firstName")
    private String firstName;

    @JsonProperty(value = "stud_lastName")
    private String lastName;

    @JsonProperty(value = "stud_collageName")
    private String collageName;

    public StudentDto() {
    }

    public StudentDto(long id, String rollNo, String mobileNo, String email, String firstName, String lastName, String collageName) {
        this.id = id;
        this.rollNo = rollNo;
        this.mobileNo = mobileNo;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.collageName = collageName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }
}

