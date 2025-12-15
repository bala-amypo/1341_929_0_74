package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired StudentRepository sturepo;
    
    @Override
      public StudentEntity postdata(StudentEntity stu){
        return sturepo.save(stu);

      }
      public List<StudentEntity> getall(){
        return sturepo.findAll();
      }
      public 




}
