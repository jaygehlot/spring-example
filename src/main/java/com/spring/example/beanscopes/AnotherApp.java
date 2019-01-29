package com.spring.example.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotherApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scopes.xml");
        Singleton singleton = context.getBean("singleton", Singleton.class);

        Prototype prototype1 = singleton.createPrototype();
        Prototype prototype2 = singleton.createPrototype();

        System.out.println((prototype1 == prototype2) ? "Same instance" : "Different instances");
        //Same instance because the application context has one opportunity to inject the Prototype bean
        //no other instance of the Prototype bean is received because it runs only once
        //as IoC container initializes on runtime
    }
}
