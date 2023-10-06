package com.example.demo.database.controller;

import com.example.demo.database.model.Employee;
import com.example.demo.database.service.EmployeeService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/employee/save")
    public Employee saveEmployee(@RequestBody Employee employeeToSave){
        return this.employeeService.addEmployee(employeeToSave);
    }

}
