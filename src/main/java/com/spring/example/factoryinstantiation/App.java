package com.spring.example.factoryinstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-instantiantion-applicationContext.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA.getYear());
    }
}
