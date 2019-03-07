package ro.jademy.carrental;

import java.util.Objects;

public class CarType {
    private String carType;

    public CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarType)) return false;
        CarType carType1 = (CarType) o;
        return carType.equals (carType1.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash (carType);
    }

    @Override
    public String toString() {
        return "CarType{" +
                "carType='" + carType + '\'' +
                '}';
    }
}
