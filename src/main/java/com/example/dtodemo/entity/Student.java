package com.example.dtodemo.entity;

import com.example.dtodemo.dto.StudentDto;
import lombok.*;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

  @Column(name = "roll_No")
  @Digits(integer = 4,fraction = 0,message = "invalid rollNo")
  private String rollNo;

  @Column(name = "mobileNo")
  @NotBlank
  @Size(min=10,message = "please input a valid number")
  @Size(max = 10,message = "Mobile digit shouldn't be more than 11")
  private String mobileNo;

  @Column(name = "email")
    @NotBlank
    @Email
    private String email;

    @Column(name = "firstName")
    @NotBlank
    @Size(min =3, message = "firstName should have atleast 2 characters")
    private String firstName;

    @Column(name = "lastName")
    @NotBlank
    @Size(min =1, message = "lastName should not be blank")
    private String lastName;

    @NotBlank
    @Size(min =4, message = "must be appropriate")
    @Column(name = "collageName")
    private String collageName;

  public Student() {
  }

  public Student(long id, String rollNo, String mobileNo, String email, String firstName, String lastName, String collageName) {
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

