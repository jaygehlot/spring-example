package com.spring.example.factory;

import com.spring.example.ioc.DigitalMediaLocator;
import com.spring.example.ioc.SourceLocator;

public class DigitalMediaLocatorFactory {

    public static SourceLocator createInstance() {
        return new DigitalMediaLocator();
    }
}
