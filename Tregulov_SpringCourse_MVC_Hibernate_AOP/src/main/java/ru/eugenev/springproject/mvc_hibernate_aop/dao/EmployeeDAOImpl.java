package ru.eugenev.springproject.mvc_hibernate_aop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.eugenev.springproject.mvc_hibernate_aop.entity.Employee;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("FROM Employee", Employee.class).getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int empId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, empId);
    }

    @Override
    public void deleteEmployee(int empId) {
        Session session = sessionFactory.getCurrentSession();
        Query query =  session.createQuery("DELETE FROM Employee WHERE id=:empId");
        query.setParameter("empId", empId);
        query.executeUpdate();
    }
}
