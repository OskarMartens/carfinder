package com.example.carfinder;

import java.util.Optional;

public class VehicleFinder {

    private final CarFinderService carFinderService;

    public VehicleFinder(CarFinderService carFinderService) {
        this.carFinderService = carFinderService;
    }

    public Optional<Car> findCar(String registrationNumber){
        return carFinderService.findCar(registrationNumber);
    }
}
