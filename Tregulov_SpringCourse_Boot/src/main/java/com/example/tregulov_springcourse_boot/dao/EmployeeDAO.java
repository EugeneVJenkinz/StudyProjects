package com.example.tregulov_springcourse_boot.dao;


import com.example.tregulov_springcourse_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int empId);
    void deleteEmployee(int empId);
}
