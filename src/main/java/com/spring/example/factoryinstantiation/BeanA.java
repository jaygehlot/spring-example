package com.spring.example.factoryinstantiation;

import java.util.Calendar;

public class BeanA {

    private final Calendar calendar;

    public BeanA(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getYear() {
        return this.calendar.get(Calendar.YEAR);
    }
}
