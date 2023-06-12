package com.dell.controller;

import com.dell.dto.UserAssignment;
import com.dell.service.EmployeeService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService service;
    @GetMapping("/employeeDashboard")
    public String employeeDashboard() {
        return "user/home";
    }

    @PostMapping("/tech_assignment")
    public String tech_assignment(@RequestBody UserAssignment userAssignment) {
        return service.tech_assignment(userAssignment);
    }
}
