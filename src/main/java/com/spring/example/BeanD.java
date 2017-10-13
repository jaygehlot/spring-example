package com.spring.example;

public class BeanD {

    public BeanD(BeanE beanE) {
        System.out.println("In the object BeanD constructor");
        beanE.execute();
    }
}
