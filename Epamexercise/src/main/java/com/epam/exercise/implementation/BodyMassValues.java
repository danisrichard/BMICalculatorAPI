package com.epam.exercise.implementation;

/**
 * This class contain the BMI result.
 */

public enum BodyMassValues {

    The_Value_is_null(-1,0),
    Severe_Thinness(0, 16),
    Moderate_Thinness(16, 17),
    Mild_Thinness(17, 18.5),
    Normal(18.5, 25),
    Overweight(25, 30),
    Obese_Class_I(30, 35),
    Obese_Class_II(35, 40),
    Obese_Class_III(40, Double.MIN_VALUE);

    private final double lowerValueInBMI;
    private final double higherValueInBMI;

    BodyMassValues(double value1, double value2) {
        this.lowerValueInBMI = value1;
        this.higherValueInBMI = value2;
    }

    public double getLowValue() {
        return lowerValueInBMI;
    }

    public double getHighValue() {
        return higherValueInBMI;
    }

}
