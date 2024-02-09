package com.example.carfinder;

import java.util.List;
import java.util.Optional;

public class CarFinderService {

    public Optional<Car> findCar(String registrationNumber) {
        for(Car car : CarProducer.CARS){
            if(car.getRegistrationNumber().equals(registrationNumber))
                return Optional.of(car);
            else{
                return CarProducer.createCar(registrationNumber);
            }
        }
        return Optional.empty();
    }

    static class CarProducer {
        private static final int NUM_WHEELS_CAR = 4;

        public static final List<Car> CARS = List.of(
                new Car("ABC123", NUM_WHEELS_CAR),
                new Car("XYZ321", NUM_WHEELS_CAR)
        );

        private static Optional<Car> createCar(String registrationNumber) {
            return Optional.of(new Car(registrationNumber, CarProducer.NUM_WHEELS_CAR));
        }
    }
}
