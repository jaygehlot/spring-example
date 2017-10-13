package com.spring.example;

import com.spring.example.ioc.KioskLocator;
import com.spring.example.ioc.RentalLocation;
import com.spring.example.ioc.RentalService;

import java.util.List;

public class AdminConsole {

    public static void main(String[] args) {
        //manual dependency injection
        //too much admin for lots of classes
        RentalService rentalService = new RentalService(new KioskLocator("key"));

        List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);

        //Allow admins to support customers
    }
}
