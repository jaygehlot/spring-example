package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //constructor is called as soon as the application-context is loaded up
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        BeanA bean1 = applicationContext.getBean(BeanA.class);
        BeanA bean2 = applicationContext.getBean("beanA", BeanA.class);  //get the bean using the name

        System.out.println("BeanA (singleton)");
        System.out.println(bean1 == bean2);
        System.out.println("\n");
        //this will result in true, beans are singletons by default, when getting a bean from the container
        //you will get only one instance from the IOC container, this can be changed using scopes

        //we haven't called constructor, constructor is called when we instantiate BeanA

        //not everything should be a bean, only things like
        //repository or services, things that require a lot of configuration
        //things that have a high cost of configuration or persist data to a database


        BeanB beanB1 = applicationContext.getBean("bean1", BeanB.class);
        BeanB beanB2 = applicationContext.getBean("bean2", BeanB.class);
        System.out.println("BeanB (two different beans)");   //each bean is a singleton, but they are different objects
        System.out.println(beanB1 == beanB2);

        SetterInjection setterInjection = applicationContext.getBean(SetterInjection.class);
        System.out.println("\n=====Setter Injection======");
        setterInjection.getBeanE().execute();

        BeanG beanG = applicationContext.getBean("beanG", BeanG.class);
        beanG.getBeanF().execute();

    }
}
