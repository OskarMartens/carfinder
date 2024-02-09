package com.example.carfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarfinderApplication {


	public static void main(String[] args) {
		SpringApplication.run(CarfinderApplication.class, args);

		CarFinderService carFinderService = new CarFinderService();
		VehicleFinder vehicleFinder = new VehicleFinder(carFinderService);
		System.out.println(vehicleFinder.findCar("ABC123").toString());
		System.out.println(vehicleFinder.findCar("XYZ321").toString());
		System.out.println(vehicleFinder.findCar("ABC111").toString());
	}

}
