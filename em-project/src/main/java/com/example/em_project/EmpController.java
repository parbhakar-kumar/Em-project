package com.example.em_project;

import org.springframework.web.bind.annotation.RestController;
import org.eclipse.persistence.testing.oxm.xmlmarshaller.structureValidation.sequence.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmpController {
    @GetMapping("employees")
    public List<Employeee> getAllEmployees()    {
        List<Employee> employess = new ArrayList<>();
        return employess;
    }
    
}
