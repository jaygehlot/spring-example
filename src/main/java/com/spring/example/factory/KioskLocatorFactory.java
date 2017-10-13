package com.spring.example.factory;

import com.spring.example.ioc.KioskLocator;
import com.spring.example.ioc.SourceLocator;

public class KioskLocatorFactory {

    public static SourceLocator createInstance() {
        return new KioskLocator("key");
    }
}
