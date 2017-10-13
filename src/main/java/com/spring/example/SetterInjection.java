package com.spring.example;

public class SetterInjection {

    private int age;
    private BeanE beanE;

    public void setAge(int age) {
        this.age = age;
        System.out.println("Calling Age setter with age " + this.age + "\n");
    }


    public void setBeanE(BeanE beanE) {
        this.beanE = beanE;
    }

    public BeanE getBeanE() {
        return beanE;
    }
}
