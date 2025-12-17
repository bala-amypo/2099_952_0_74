package com.example.demo.controller;

import org.springframework.web.blind.annotation.RestController;
@RestController

public class StudentController{
   @PostMapping("/addStudent")
   public Student assStudent(@RequestBody)
}