package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Salary;
import com.example.EmployeeManagement.Repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceIMP implements SalaryService{

    @Autowired
    private SalaryRepository salaryRepository;
    @Override
    public void addSalary(Salary salary) {
        salaryRepository.save(salary);
    }
}
