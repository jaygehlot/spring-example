package com.spring.example.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jayg on 26/08/2017.
 */
public class StoreLocator implements SourceLocator {

    private static List<RentalLocation> locations = new ArrayList<>();

    static {
        locations.add(new RentalLocation("Blockbuster", Arrays.asList("Forest Gump", "Speed")));
        locations.add(new RentalLocation("Gary's Outlet", Arrays.asList("Jaws", "Ghost")));
        locations.add(new RentalLocation("West Coast Video", Arrays.asList("Forest Gump", "Hook")));
    }

    @Override
    public List<RentalLocation> find(String zipCode, int radius) {
        return locations;
    }
}
