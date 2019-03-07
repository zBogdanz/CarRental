package ro.jademy.carrental;

import java.util.Objects;

public class FuelType {
    private String fuelType;

    public FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FuelType)) return false;
        FuelType fuelType1 = (FuelType) o;
        return Objects.equals (fuelType, fuelType1.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash (fuelType);
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuelType='" + fuelType + '\'' +
                '}';
    }
}
