package com.example.spring.rest.service;

import com.example.spring.rest.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveOrUpdateEmployee(Employee employee);
    Employee getEmployee(int empId);
    void deleteEmployee(int empId);
}
