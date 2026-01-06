package com.company.employeemanagement.service;

import java.util.List;

import com.company.employeemanagement.entity.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    List<Employee> getActiveEmployees();

    Employee getEmployeeById(Long id);

    Employee getEmployeeByEmail(String email);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
