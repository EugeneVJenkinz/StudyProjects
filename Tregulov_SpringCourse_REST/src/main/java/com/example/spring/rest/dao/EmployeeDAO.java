package com.example.spring.rest.dao;

import com.example.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int empId);
    void deleteEmployee(int empId);
}
