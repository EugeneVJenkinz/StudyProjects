package ru.eugenev.springcoursehibernatemanytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatemanytomany.entity.Child;
import ru.eugenev.springcoursehibernatemanytomany.entity.Section;

public class AddLinksBetweenData {
    public static void main(String[] args) {
        Session session = null;
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory())
        {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child1 = session.get(Child.class, 1);
            Child child2 = session.get(Child.class, 2);
            Child child3 = session.get(Child.class, 3);
            Child child4 = session.get(Child.class, 4);
            Section section1 = session.get(Section.class, 1);
            Section section2 = session.get(Section.class, 2);
            Section section3 = session.get(Section.class, 3);
            child1.addSection(section1);
            child1.addSection(section2);
            child2.addSection(section3);
            child3.addSection(section3);
            child4.addSection(section1);
            child4.addSection(section2);
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
