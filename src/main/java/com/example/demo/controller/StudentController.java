package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired StudentService stu;

    @PostMapping("/post")
    public StudentEntity posts(@RequestBody StudentEntity stu){
        return stu.
    }

    
}
