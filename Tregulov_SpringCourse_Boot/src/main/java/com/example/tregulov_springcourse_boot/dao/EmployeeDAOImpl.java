package com.example.tregulov_springcourse_boot.dao;

import com.example.tregulov_springcourse_boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {
/*        Session session = entityManager.unwrap(Session.class);
        List<Employee> allEmployees = session.createQuery("FROM Employee", Employee.class).getResultList();*/
        Query query = entityManager.createQuery("FROM Employee");
        return query.getResultList();
    }
    //Если id не указан, то создаст нового сотрудника
    //Если указан, то обновит существующего
    @Override
    public void saveEmployee(Employee employee) {
/*        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);*/
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int empId) {
/*        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class, empId);*/
        return entityManager.find(Employee.class, empId);
    }

    @Override
    public void deleteEmployee(int empId) {
/*        Session session = entityManager.unwrap(Session.class);
        Query query =  session.createQuery("DELETE FROM Employee WHERE id=:empId");
        query.setParameter("empId", empId);
        query.executeUpdate();*/
        Query query = entityManager.createQuery("DELETE FROM Employee WHERE id=:empId");
        query.setParameter("empId", empId);
        query.executeUpdate();
    }

}
