package com.example.demo.service;

public interface StudentService {
    StudentService postdata(Student stu);
    List<Student> getdata();
    Student updatedata(int id,Student std);
    String deletedata(int id);
}