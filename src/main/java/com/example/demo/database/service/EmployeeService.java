package com.example.demo.database.service;

import com.example.demo.database.model.Employee;
import com.example.demo.database.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee addEmployee(Employee employee){
        try{
            Employee savedEmp = employeeRepository.save(employee);
            return savedEmp;
        }catch (Exception e){
            System.out.println("Error Caught.. \n"+ e.getMessage());
            return null;
        }
    }
    public List<Employee> getAllEmployees(){
        try{
            List<Employee> savedEmp = employeeRepository.findAll();
            return savedEmp;
        }catch (Exception e){
            System.out.println("Error Caught.. \n"+ e.getMessage());
            return null;
        }
    }
}
