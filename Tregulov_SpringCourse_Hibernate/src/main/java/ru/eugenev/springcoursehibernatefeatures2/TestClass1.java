package ru.eugenev.springcoursehibernatefeatures2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatefeatures2.entity.Employee;
import ru.eugenev.springcoursehibernatefeatures2.entity.Detail;

public class TestClass1 {
    public static void main(String[] args) {
        Session session = null;
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory())
        {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
