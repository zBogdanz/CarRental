package ro.jademy.carrental.car;

import java.util.Objects;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;

    // Q: how can we better represent the car type?
    public CarType carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?
    public FuelType fuelType; // diesel, gasoline, alternative

    public Integer doorNumber;

    public String color;

    // Q: how can we better represent the transmission type?
    public TransmissionType transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
    public Engine engine;

    // Q: how can we better represent money value?
    public Integer basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
    private boolean available;


    public Car(String make, String model, Integer year, CarType carType, FuelType fuelType, Integer doorNumber, String color, TransmissionType transmissionType, Engine engine, Integer basePrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public CarType getCarType() {
        return carType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals (make, car.make) &&
                Objects.equals (model, car.model) &&
                Objects.equals (year, car.year) &&
                Objects.equals (carType, car.carType) &&
                Objects.equals (fuelType, car.fuelType) &&
                Objects.equals (doorNumber, car.doorNumber) &&
                Objects.equals (color, car.color) &&
                Objects.equals (transmissionType, car.transmissionType) &&
                Objects.equals (engine, car.engine) &&
                Objects.equals (basePrice, car.basePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash (make, model, year, carType, fuelType, doorNumber, color, transmissionType, engine, basePrice);
    }

    @Override
    public String toString() {
        return "Car " +
                "make=" + make +
                " model=" + model +
                " year=" + year +
                " carType=" + carType +
                " fuelType=" + fuelType +
                " doorNumber=" + doorNumber +
                " color=" + color +
                " transmission=" + transmissionType +" "+
                  engine +
                " basePrice=" + basePrice;
    }
}
