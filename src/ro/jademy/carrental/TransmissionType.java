package ro.jademy.carrental;

import java.util.Objects;

public class TransmissionType {
    private String transmissionType;

    public TransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransmissionType)) return false;
        TransmissionType that = (TransmissionType) o;
        return Objects.equals (transmissionType, that.transmissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash (transmissionType);
    }

    @Override
    public String toString() {
        return "TransmissionType{" +
                "transmissionType='" + transmissionType + '\'' +
                '}';
    }
}
