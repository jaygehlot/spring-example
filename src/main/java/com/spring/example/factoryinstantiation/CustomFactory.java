package com.spring.example.factoryinstantiation;

import com.spring.example.BeanB;

public class CustomFactory {

    private CustomFactory() {
        System.out.println("Instantiating factory");
    }

    public BeanB getBeanBInstance() {
        System.out.println("Returning instance of Bean A");
        return new BeanB();
    }
}
