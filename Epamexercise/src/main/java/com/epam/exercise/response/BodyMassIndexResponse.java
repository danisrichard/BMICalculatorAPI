package com.epam.exercise.response;

import com.epam.exercise.implementation.BodyMassValues;

public class BodyMassIndexResponse {
    private BodyMassValues bodyMassValue;
    private double bodyMassIndex;

    public BodyMassIndexResponse(BodyMassValues value, double bodyMassIndex) {
        this.bodyMassValue = value;
        this.bodyMassIndex = bodyMassIndex;
    }

    public BodyMassValues getValue1() {
        return bodyMassValue;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BodyMassIndexResponse that = (BodyMassIndexResponse) o;

        if (Double.compare(that.bodyMassIndex, bodyMassIndex) != 0) return false;
        return bodyMassValue == that.bodyMassValue;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bodyMassValue != null ? bodyMassValue.hashCode() : 0;
        temp = Double.doubleToLongBits(bodyMassIndex);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BodyMassIndexResponse{" +
                "BodyMassIndexValue=" + bodyMassValue +
                ", bodyMassIndex=" + bodyMassIndex +
                '}';
    }
}
