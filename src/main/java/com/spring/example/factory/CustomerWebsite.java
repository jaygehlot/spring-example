package com.spring.example.factory;

import com.spring.example.ioc.RentalLocation;
import com.spring.example.ioc.RentalService;

import java.util.List;

public class CustomerWebsite {

    public static void main(String[] args) {
        RentalService rentalService = new RentalService(DigitalMediaLocatorFactory.createInstance());

        List<RentalLocation> locations = rentalService.find("The Grey", "16802", 10);

        //Allow website users to find titles
    }
}
