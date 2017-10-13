package com.spring.example;

public class BeanF {

    private final String value;

    public BeanF(String value) {
        this.value = value;
    }


    public void execute() {
        System.out.println("In Bean F");
        System.out.println(value);
    }
}
