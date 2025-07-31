package com;

import java.util.ArrayList;
import java.util.List;

import com.example.em_project.Employee;
import com.example.em_project.EmployeeService;

public  class EmployeeServiceImpl implements EmployeeService {
     List<Employee>empoloyees = new ArrayList<>();

     @Override
     public Employee createEmployee(Employee employee) {
        empoloyees.add(employee);
        return employee;
    }


     @Override
     public List<Employee> readEmployees() {
        return empoloyees;
     }




    @Override
    public boolean deleteEmployee(Long id) {
       empoloyees.remove(id);
       return true;
    }

  
 
}
