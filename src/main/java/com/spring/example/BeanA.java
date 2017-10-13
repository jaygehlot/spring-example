package com.spring.example;

public class BeanA {

//    public BeanA() {
//        System.out.println("spring instantiated me!");
//    }

    public BeanA(String value) {
        System.out.println("string constructor");
        System.out.println(value+"\n");
    }

    public BeanA(int value) {
        System.out.println("int constructor");
        System.out.println(value);
    }

    public BeanA(boolean value) {
        System.out.println("boolean constructor");
        System.out.println(value);
    }
}
