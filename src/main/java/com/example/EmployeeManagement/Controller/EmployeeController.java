package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Entity.Department;
import com.example.EmployeeManagement.Entity.Employee;


import com.example.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/salary")
    public ResponseEntity<?> getEmployeesBySalaryRange(
            @RequestParam int minSalary,
            @RequestParam int maxSalary) {

        List<Employee> employees = employeeService.getEmployeesBySalaryRange(minSalary, maxSalary);

        if (employees.isEmpty()) {
            return ResponseEntity.status(404).body("No employees found within the given salary range.");
        }

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{designation}")
    public ResponseEntity<?> getByDesignation(@PathVariable String designation) {
        var list = employeeService.getByDesignation(designation);
        return list.isEmpty()
                ? ResponseEntity.status(404).body("No employees with this designation")
                : ResponseEntity.ok(list);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Employee>> getEmployeesWithPagination(
            @RequestParam int page,
            @RequestParam int size) {

        return ResponseEntity.ok(employeeService.getAllEmployees(page, size));
    }












}

