package com.example.EmployeeManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Salary
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int salary;

    @OneToOne(mappedBy = "salary")
    private Employee employee;

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Salary(int id, int salary, Employee employee) {
        this.id = id;
        this.salary = salary;
        this.employee = employee;
    }


    public Salary()
    {

    }
}
