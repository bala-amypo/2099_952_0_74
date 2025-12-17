package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;
@Repository
public intrface StudentRepository extends JpaRepository<Student,Long>{


}