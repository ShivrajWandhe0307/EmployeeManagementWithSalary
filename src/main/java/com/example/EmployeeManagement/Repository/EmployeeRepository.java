package com.example.EmployeeManagement.Repository;


import com.example.EmployeeManagement.Entity.Department;
import com.example.EmployeeManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :minSalary AND :maxSalary")
    Collection<Employee> findEmployeesBySalary(@Param("minSalary") int minSalary, @Param("maxSalary") int maxSalary);


}
