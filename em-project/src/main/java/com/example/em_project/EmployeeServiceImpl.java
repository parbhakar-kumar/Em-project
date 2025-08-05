package com.example.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        // Convert Employee to EmployeeEntity for persistence
        EmployeeEntity entity = new EmployeeEntity();
        entity.setName(employee.getName());
        entity.setPhone(employee.getPhone());
        entity.setEmail(employee.getEmail());
        
        // Save entity
        employeeRepository.save(entity);
        
        // Convert back to Employee for return
        employee.setId(entity.getId());
        return employee;
    }

    @Override
    public List<Employee> readEmployees() {
        // For now, returning a mock list since we're not implementing full CRUD with database
        // In a real implementation, we would fetch from repository and convert entities to Employees
        return new ArrayList<>();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
