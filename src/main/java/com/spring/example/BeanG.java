package com.spring.example;

public class BeanG {

    private int age;
    private BeanF beanF;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBeanF(BeanF beanF) {
        this.beanF = beanF;
    }

    public BeanF getBeanF() {
        return beanF;
    }
}
