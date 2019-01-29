package com.spring.example;

public class BeanF {

    private final String value;

    public BeanF(String value12) {
        this.value = value12;
    }


    public void execute() {
        System.out.println("In Bean F");
        System.out.println(value);
    }
}
