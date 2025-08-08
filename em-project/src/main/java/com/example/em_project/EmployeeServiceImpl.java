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
    public String createEmployee(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        // Convert Employee to EmployeeEntity for persistence
        // EmployeeEntity entityEntity = new EmployeeEntity();
        // BeanUtils.copyProperties(employee, entityEntity);
        // employeeRepository.save(entityEntity);
        // return employee;
        employees.add(employee);
        return " Saved Successfully";

    }

   
   @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeeEntitiesList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        for (EmployeeEntity entityEntity : employeeEntitiesList) {
            Employee emp = new Employee();
            emp.setName(entityEntity.getName());
            emp.setEmail(entityEntity.getEmail());
            employees.add(emp);
        }
        return employees;
    }
    @Override
    public boolean deleteEmployee(Long id) {
        // employees.remove(id);
        return true;
    }
}
