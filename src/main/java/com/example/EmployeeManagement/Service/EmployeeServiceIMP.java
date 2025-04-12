package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceIMP implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmp(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getALl(int minsal,int maxsal) {
        return (List<Employee>) employeeRepository.findEmployeesBySalary(minsal,maxsal);
    }


}
