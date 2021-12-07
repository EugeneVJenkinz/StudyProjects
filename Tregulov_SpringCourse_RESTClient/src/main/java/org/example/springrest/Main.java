package org.example.springrest;

import org.example.springrest.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        //communication.getAllEmployees().stream().forEach(employee -> System.out.println(employee));
        System.out.println(communication.getEmployeeById(8));
    }
}
