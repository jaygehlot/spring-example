package com.spring.example.ioc;

import java.util.List;

public class RentalLocation {

    private String outlet;
    private List<String> titles;

    public RentalLocation(String videoOutlet, List<String> videos) {
        this.outlet = videoOutlet;
        this.titles = videos;

    }

    public List<String> getTitles() {
        return titles;
    }

    public String getOutlet() {
        return outlet;
    }
}
