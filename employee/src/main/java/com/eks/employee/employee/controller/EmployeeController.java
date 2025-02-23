package com.eks.employee.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public String employee() {

        return "Hi employee:"+ UUID.randomUUID().toString();
    }
}
