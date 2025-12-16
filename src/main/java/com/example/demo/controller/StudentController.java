package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 1️⃣ Create Student
    @PostMapping("/save")
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return studentService.postdata(student);
    }

    // 2️⃣ Get All Students
    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return studentService.getall();
    }

    // 3️⃣ Update Student
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        return studentService.updatedata(id, student);
    }

    // 4️⃣ Delete Student
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deletedata(id);
    }
}
