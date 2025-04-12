package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Department;

import com.example.EmployeeManagement.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceIMP implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }




}
