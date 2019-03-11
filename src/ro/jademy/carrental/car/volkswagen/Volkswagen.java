package ro.jademy.carrental.car.volkswagen;

import ro.jademy.carrental.car.*;

public abstract class Volkswagen extends Car {

    public Volkswagen( String model, Integer year, CarType carType, FuelType fuelType, String color, Engine engine, Integer basePrice) {
        super ("Volkswagen", model, year, carType, fuelType, 4, color, new TransmissionType ("automata"), engine, basePrice);
    }
}
