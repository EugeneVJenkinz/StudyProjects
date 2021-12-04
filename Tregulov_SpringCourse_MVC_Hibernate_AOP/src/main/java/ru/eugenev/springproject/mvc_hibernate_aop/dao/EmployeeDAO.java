package ru.eugenev.springproject.mvc_hibernate_aop.dao;

import ru.eugenev.springproject.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int empId);
    void deleteEmployee(int empId);
}
