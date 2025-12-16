package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;


@Service
public class StudentServiceImpl  implements StudentService { 
//save
//findById()
//findAll();
//existsById()
//deleteById()

@Autowired StudentRepo repo;

@Override
  StudentEntity postdata(StudentEntity stu);{
   return repo.save(stu);
 }
 @Override
    public List<StudentEntity> getdata(){
     return repo.findAll();
    }
    @Override
   public  Student updatedata(int id,Student std){
    
     if(repo.existsById(id)){
        std.setId(id);
        return repo.save(std);

     }
     return null;

    }
    @Override
   public  String deletedata(int id){
    repo.deleteById(id);
    return "Deleted Sucessfully";

    }


    
}
