package com.employeeapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "employee_records")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String designation;
    private int age;
    private String city;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, String designation, int age, String city) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.city = city;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +
               ", designation=" + designation +
               ", age=" + age +
               ", city=" + city + "]";
    }
}