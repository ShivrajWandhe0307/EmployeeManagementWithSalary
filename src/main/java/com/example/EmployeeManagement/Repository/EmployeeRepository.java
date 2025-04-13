package com.example.EmployeeManagement.Repository;


import com.example.EmployeeManagement.Entity.Department;
import com.example.EmployeeManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

    @Query("SELECT e FROM Employee e WHERE e.salary.salary BETWEEN :min AND :max")
    List<Employee> findEmployeesBySalaryRange(@Param("min") int min, @Param("max") int max);


    List<Employee> findByDesignation(String designation);



}
