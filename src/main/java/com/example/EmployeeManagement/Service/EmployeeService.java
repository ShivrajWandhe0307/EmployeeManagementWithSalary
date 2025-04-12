package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService
{
  public void addEmployee(Employee employee);

  public Optional<Employee> getEmp(int id);

  public List<Employee> getALl(int salary1,int s2);







}
