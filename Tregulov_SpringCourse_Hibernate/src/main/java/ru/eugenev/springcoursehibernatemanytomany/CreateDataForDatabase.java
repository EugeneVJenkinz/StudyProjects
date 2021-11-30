package ru.eugenev.springcoursehibernatemanytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatemanytomany.entity.Child;
import ru.eugenev.springcoursehibernatemanytomany.entity.Section;

public class CreateDataForDatabase {
    public static void main(String[] args) {
        Session session = null;
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory())
        {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child1 = new Child("Ivan", 20);
            Child child2 = new Child("Semen", 21);
            Child child3 = new Child("Van", 40);
            Child child4 = new Child("Oleg", 30);
            session.save(child1);
            session.save(child2);
            session.save(child3);
            session.save(child4);
            Section section1 = new Section("Football");
            Section section2 = new Section("Dance");
            Section section3 = new Section("Gym");
            session.save(section1);
            session.save(section2);
            session.save(section3);
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
