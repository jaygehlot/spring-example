package com.spring.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CustomerWebsite {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        //take a look in the application-context.xml
        RentalService rentalService = context.getBean("digitalMediaRentalService", RentalService.class);

        List<RentalLocation> locations = rentalService.find("Forest Gump", "16802", 10);

        for(RentalLocation location: locations) {
            System.out.println( location.getOutlet());
        }
    }
}
