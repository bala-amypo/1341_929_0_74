package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired StudentService stu;

    @PostMapping("/post")
    public StudentEntity posts(@RequestBody StudentEntity stu){
        return stu.postdata(stu);

    }
    @GetMapping("/gets")
    public List <StudentEntity> gets(){
        return stu.getall();

    }

    @PutMapping("/put/{id}")
    putblic StudentEntity
    
}
