package com.company.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.employeemanagement.entity.Employee;

@Controller
public class EmployeeActionController {

    @GetMapping("/employee/attendance")
    public String markAttendance(Model model) {
        model.addAttribute("message", "Attendance marked successfully ✅");
        return "attendance";
    }

    @GetMapping("/employee/leave")
    public String applyLeaveForm() {
        return "apply_leave";
    }

    @PostMapping("/employee/leave")
    public String submitLeave(Model model) {
        model.addAttribute("message", "Leave applied successfully ✅");
        return "leave_success";
    }

    @GetMapping("/employee/profile")
    public String viewProfile(Model model) {

        Employee employee = new Employee();
        employee.setName("Test Employee");
        employee.setEmail("employee@gmail.com");
        employee.setDepartment("IT");
        employee.setStatus("Active");

        model.addAttribute("employee", employee);
        return "employee_profile";
    }

    @GetMapping("/employee/edit")
    public String editProfile(Model model) {

        Employee employee = new Employee();
        employee.setName("Test Employee");
        employee.setEmail("employee@gmail.com");
        employee.setDepartment("IT");

        model.addAttribute("employee", employee);
        return "edit_profile";
    }

    @PostMapping("/employee/edit")
    public String updateProfile(Model model) {
        model.addAttribute("message", "Profile updated successfully ✅");
        return "profile_updated";
    }
}
