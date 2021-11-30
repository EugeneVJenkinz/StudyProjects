package ru.eugenev.springcoursehibernatefeatures1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatefeatures1.entity.Employee;

import java.util.List;

public class TakeObjectsFromDatabaseUsingHQL {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employeeList = session.createQuery("FROM Employee WHERE salary > 8000").getResultList();
            for (Employee e : employeeList) System.out.println(e);
            session.close();
        }
    }
}
