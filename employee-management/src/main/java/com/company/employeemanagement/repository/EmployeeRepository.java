package com.company.employeemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmail(String email);

    List<Employee> findByStatus(String status);
}
