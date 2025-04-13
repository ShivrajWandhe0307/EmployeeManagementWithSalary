package com.example.EmployeeManagement.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Salary
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int salary;

    @OneToMany(mappedBy = "salary")
    private List<Employee> employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        return employee;
    }

    public void setEmployees(List<Employee> employees) {
        this.employee = employees;
    }

    public Salary(int id, int salary, List<Employee> employee) {
        this.id = id;
        this.salary = salary;
        this.employee = employee;
    }


    public Salary()
    {

    }
}
