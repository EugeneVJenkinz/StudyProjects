package com.example.tregulov_springcourse_boot.service;


import com.example.tregulov_springcourse_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveOrUpdateEmployee(Employee employee);
    Employee getEmployee(int empId);
    void deleteEmployee(int empId);
}
