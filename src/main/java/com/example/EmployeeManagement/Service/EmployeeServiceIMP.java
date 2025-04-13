package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceIMP implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmpByDepartmentId(int departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }


    public List<Employee> getEmployeesBySalaryRange(int min, int max) {
        return employeeRepository.findEmployeesBySalaryRange(min, max);
    }

    public List<Employee> getByDesignation(String designation) {
        return employeeRepository.findByDesignation(designation);
    }

    public Page<Employee> getAllEmployees(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findAll(pageable);
    }


}

