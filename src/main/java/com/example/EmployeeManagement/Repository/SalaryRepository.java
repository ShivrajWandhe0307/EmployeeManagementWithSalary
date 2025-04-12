package com.example.EmployeeManagement.Repository;

import com.example.EmployeeManagement.Entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary,Integer>
{

}
