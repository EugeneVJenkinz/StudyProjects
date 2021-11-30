package ru.eugenev.springcoursehibernatefeatures1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatefeatures1.entity.Employee;

public class TakeObjectsFromDatabaseById {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee);
            session.close();
        }
    }
}
