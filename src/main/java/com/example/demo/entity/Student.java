package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dept;
    private String sec;
    private int age;
    private double cgpa;
    private boolean placed;

    // Constructors
    public Student() {}

    public Student(String name, String dept, String sec,
                   int age, double cgpa, boolean placed) {
        this.name = name;
        this.dept = dept;
        this.sec = sec;
        this.age = age;
        this.cgpa = cgpa;
        this.placed = placed;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public String getSec() { return sec; }
    public int getAge() { return age; }
    public double getCgpa() { return cgpa; }
    public boolean isPlaced() { return placed; }

    public void setPlaced(boolean placed) { this.placed = placed; }
}
