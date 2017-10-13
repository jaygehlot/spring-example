package com.spring.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {

    private static String TITLE = "Forest Gump";

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        RentalService rentalService = context.getBean("rentalService", RentalService.class);
        //allows rental service to be strongly typed

        List<RentalLocation> locations = rentalService.find(TITLE, "16802", 10);

        System.out.printf("%s is available at the following locations:\n", TITLE);

        for(RentalLocation location:locations) {
            System.out.println(location.getOutlet());
        }
    }
}
