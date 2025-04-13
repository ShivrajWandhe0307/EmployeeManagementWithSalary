package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;


public interface EmployeeService
{
  public void addEmployee(Employee employee);

  public Optional<Employee> getEmp(int id);

  public List<Employee> getEmployeesBySalaryRange(int min, int max);


  public List<Employee> getByDesignation(String designation);



  public Page<Employee> getAllEmployees(int page, int size);



}
