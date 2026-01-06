package com.company.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.employeemanagement.service.EmployeeService;

@Controller
public class AdminEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/admin/employees/all")
    public String allEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees_all";
    }

    @GetMapping("/admin/employees/active")
    public String activeEmployees(Model model) {
        model.addAttribute("employees", employeeService.getActiveEmployees());
        return "employees_active";
    }

    @GetMapping("/admin/employees/departments")
    public String departmentEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees_department";
    }
}
