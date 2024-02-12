package com.example.carfinder;

import java.util.List;

public class Car {

    private final String registrationNumber;
    private List<Wheel> wheels;

    public Car(String registrationNumber, List<Wheel> wheels) {
        this.registrationNumber = registrationNumber;
        this.wheels = wheels;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
