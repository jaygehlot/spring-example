package com.spring.example.ioc;

import java.util.List;

/**
 * Created by jayg on 26/08/2017.
 */
public interface SourceLocator {

    List<RentalLocation> find(String zipCode, int radius);
}
