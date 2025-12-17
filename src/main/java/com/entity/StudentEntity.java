package com.example.demo.entity;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
@Entity
public class StudentEntity{
    @id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private Long id;
    private string name;
    private string email;
    private float cgpa;

}