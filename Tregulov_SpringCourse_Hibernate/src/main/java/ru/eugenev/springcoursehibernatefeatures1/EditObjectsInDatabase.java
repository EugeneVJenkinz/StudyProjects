package ru.eugenev.springcoursehibernatefeatures1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatefeatures1.entity.Employee;

import java.util.List;

public class EditObjectsInDatabase {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employeeList = session.createQuery("FROM Employee WHERE salary > 4000").getResultList();
            for (Employee e : employeeList) {
                System.out.println(e);
                e.setSalary(e.getSalary()+1000);
            }

            for (Employee e : employeeList) {
                System.out.println(e);
                e.setSalary(e.getSalary());
            }

            session.createQuery("UPDATE Employee SET salary = 50000 WHERE name = 'Ivan'").executeUpdate();
            session.close();
        }
    }
}
