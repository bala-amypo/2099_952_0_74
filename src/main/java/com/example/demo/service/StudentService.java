package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.Student;
public interface StudentService{
    Student poststudent(Student st);
    List<Student> getAllstudents();
    Student getById(Long id);
    
}