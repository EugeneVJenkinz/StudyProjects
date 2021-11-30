package ru.eugenev.springcoursehibernatemanytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.eugenev.springcoursehibernatemanytomany.entity.Child;
import ru.eugenev.springcoursehibernatemanytomany.entity.Section;

public class GetInfo {
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
            Section section1 = session.get(Section.class, 1);
            System.out.println(child1.getName());
            System.out.println(child1.getSectionList());
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println(section1.getName());
            System.out.println(section1.getChildList());
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
