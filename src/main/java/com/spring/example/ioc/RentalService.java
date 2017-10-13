package com.spring.example.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayg on 26/08/2017.
 */
public class RentalService {

    //private StoreLocatorLocator storeLocator = new StoreLocator(); //tight coupling, this makes RentalService tightly coupled
                                                                //with StoreLocator
    private SourceLocator sourceLocator;

    public RentalService(SourceLocator sourceLocator) {
        this.sourceLocator = sourceLocator;
    }

    public List<RentalLocation> find(String title, String zipCode, int miles) {
        List<RentalLocation> locations = this.sourceLocator.find(zipCode, miles);

        List<RentalLocation> results = new ArrayList<>();
        for (RentalLocation location: locations) {
            if (location.getTitles().contains(title)) {
                results.add(location);
            }
        }
        return results;
    }
}
