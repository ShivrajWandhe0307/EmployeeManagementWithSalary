package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Entity.Department;

import com.example.EmployeeManagement.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Department")
public class DepartmentController

{

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/add")
    public String addDepart(@RequestBody Department department)
    {
        departmentService.addDepartment(department);
        return "Department Saved";
    }






}
