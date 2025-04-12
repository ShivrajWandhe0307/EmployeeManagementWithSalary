package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Entity.Department;
import com.example.EmployeeManagement.Entity.Employee;

import com.example.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmp( @RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
        return "Employee Save";
    }


    @GetMapping("/get")
    public Optional<Employee> getEmp(@RequestBody Department department)
    {
        Optional<Employee> e1=employeeService.getEmp(department.getId());;
        return e1;
    }

    @GetMapping("/getAll")
    public List<Employee> getAll(@RequestParam("min") int sal, @RequestParam("max") int salary2){
        List<Employee> emp=employeeService.getALl(sal,salary2);
        return  emp;
    }








}

