package com.example.EmployeeManagement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String designation;

    @Column
    private Date joinDate;


    @OneToOne()
    @JoinColumn(name = "Depart-id")
    @JsonIgnore
    private Department department;

    @ManyToOne()
    @JoinColumn(name = "salary_id")
    @JsonIgnore
    private Salary salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Employee()
    {

    }

    public Employee(int id, String name, String designation, Date joinDate, Department department, Salary salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.joinDate = joinDate;
        this.department = department;
        this.salary = salary;
    }
}
