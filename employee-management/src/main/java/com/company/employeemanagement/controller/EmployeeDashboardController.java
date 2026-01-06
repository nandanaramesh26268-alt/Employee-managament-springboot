package com.company.employeemanagement.controller;

import org.springframework.security.core.Authentication;   // ✅ correct import
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.employeemanagement.entity.Employee;

@Controller
public class EmployeeDashboardController {

    @GetMapping("/employee/dashboard")
    public String employeeDashboard(Authentication authentication, Model model) {

        Employee employee = new Employee();
        employee.setName(authentication.getName()); // 👈 logged-in username
        employee.setEmail("employee@gmail.com");
        employee.setDepartment("IT");
        employee.setStatus("Active");

        model.addAttribute("employee", employee);
        model.addAttribute("username", authentication.getName());

        return "employee_dashboard";
    }
}
