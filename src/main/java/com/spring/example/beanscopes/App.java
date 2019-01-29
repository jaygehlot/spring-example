package com.spring.example.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scopes.xml");
        Prototype prototype1 = context.getBean("prototype", Prototype.class);
        Prototype prototype2 = context.getBean("prototype", Prototype.class);

        System.out.println("Prototype bean, is of a prototype scope so a new instance each time");
        System.out.println(prototype1 == prototype2);

    }
}
