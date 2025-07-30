package com;

import java.util.List;

import com.example.em_project.Employee;
import com.example.em_project.EmployeeService;

public abstract class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> readEmployees() {
        // TODO: implement method logic
        return null;
    }

    @Override
    public Employee ceratEmployees(Employee employee) {
       EmployeeService.add(employee);
        return employee;
    }
}
