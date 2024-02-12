package com.example.carfinder;

import java.util.ArrayList;
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

        private static List<Wheel> getWheelList(){

            ArrayList<Wheel> wheels = new ArrayList<>();
            for (int i = 0; i < NUM_WHEELS_CAR; i++){
                wheels.add(new Wheel());
            }
            return wheels;
        }

        public static final List<Car> CARS = List.of(
                new Car("ABC123", CarProducer.getWheelList()),
                new Car("XYZ321", CarProducer.getWheelList())
        );

        private static Optional<Car> createCar(String registrationNumber) {
            return Optional.of(new Car(registrationNumber, CarProducer.getWheelList()));
        }
    }
}
