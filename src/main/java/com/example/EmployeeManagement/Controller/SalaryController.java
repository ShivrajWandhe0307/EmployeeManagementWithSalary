package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Entity.Salary;
import com.example.EmployeeManagement.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Salary")
public class SalaryController
{
    @Autowired
    private SalaryService salaryService;

    @PostMapping("/add")
    public String addSal(@RequestBody Salary salary)
    {
        salaryService.addSalary(salary);
        return "Salary Save";
    }

}
