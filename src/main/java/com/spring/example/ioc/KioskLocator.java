package com.spring.example.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jayg on 26/08/2017.
 */
public class KioskLocator implements SourceLocator {

    private static List<RentalLocation> locations = new ArrayList<>();

    public KioskLocator(String key) {

    }

    static {
        locations.add(new RentalLocation("Kiosk A", Arrays.asList("Forest Gump", "Speed")));
        locations.add(new RentalLocation("Kiosk B", Arrays.asList("Jaws", "Ghost")));
        locations.add(new RentalLocation("Kiosk C", Arrays.asList("Forest Gump", "Hook")));
    }

    @Override
    public List<RentalLocation> find(String zipCode, int radius) {
        return locations;
    }
}
