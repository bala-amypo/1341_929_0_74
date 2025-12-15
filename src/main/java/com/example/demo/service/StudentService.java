package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getall();
    StudentEntity updatedata(int id,StudentEntity stu);
     String deletedata(int id);
}
