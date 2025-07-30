package com.example.em_project;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {
 List<Employee>empoloyees = new ArrayList<>();
//  List<Employee>empoloyees = new ArrayList<>();
EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmpoloyees() { 
        empoloyees.add(null);
        return empoloyees;
        // empoloyees.add(null);
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {

        empoloyees.add(employee);
        return "Employee added successfully";
        // empoloyees.add(employee);
       return  employeeService.ceratEmployee(employee);
        

    }
    
    
    
}
