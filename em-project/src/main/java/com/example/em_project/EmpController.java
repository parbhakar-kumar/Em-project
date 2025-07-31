package com.example.em_project;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {
//  List<Employee>empoloyees = new ArrayList<>();

EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmpoloyees() { 
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee (@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        
        return "seved successfully";
        
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
         if(employeeService.deleteEmployee(id)) {
              return "Deleted Successfully";
    }     
         return "Employee not found";
    }
     

    
    
    
}
