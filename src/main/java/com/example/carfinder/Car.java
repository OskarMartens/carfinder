package com.example.carfinder;

public class Car {

    private final String registrationNumber;
    private int wheels;

    public Car(String registrationNumber, int wheels) {
        this.registrationNumber = registrationNumber;
        this.wheels = wheels;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
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
