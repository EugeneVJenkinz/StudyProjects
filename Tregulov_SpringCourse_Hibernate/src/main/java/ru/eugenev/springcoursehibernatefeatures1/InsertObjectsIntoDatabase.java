package ru.eugenev.springcoursehibernatefeatures1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatefeatures1.entity.Employee;

public class InsertObjectsIntoDatabase {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov", "IT", 10000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
