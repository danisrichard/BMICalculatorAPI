package com.epam.exercise.implementation;

import com.epam.exercise.response.BodyMassIndexResponse;

import java.text.DecimalFormat;
import java.util.EnumSet;

public class BodyMassCalculatorImpl implements BodyMassController {

    private DecimalFormat df = new DecimalFormat();

    private final int USC_UNIT = 703;

    public BodyMassIndexResponse calculate(double height, double weight) {
        double finalCalculateValue = -1;

        if (height > 0 && weight > 0) {
            finalCalculateValue = Double.parseDouble(df.format( weight/ Math.pow(height, 2)));
        }

        BodyMassValues bodyMassValue = calculateBodyMassTableValue(finalCalculateValue);

        return new BodyMassIndexResponse(bodyMassValue,finalCalculateValue);
    }

    public BodyMassIndexResponse calculate(double heightFeet, double heightInch, double weight) {
        double finalCalculateValue = -1;

        double height = heightFeet*12 + heightInch;
        
        if(height > 0 && weight > 0 ){
            finalCalculateValue = Double.parseDouble(df.format(USC_UNIT * weight / Math.pow(height, 2)));
        }

        BodyMassValues bodyMassValue = calculateBodyMassTableValue(finalCalculateValue);

        return new BodyMassIndexResponse(bodyMassValue,finalCalculateValue);
    }

    private BodyMassValues calculateBodyMassTableValue(double param){
        return EnumSet.allOf(BodyMassValues.class).stream()
            .filter(value -> param > value.getLowValue() && param < value.getHighValue())
            .findFirst().orElse(BodyMassValues.The_Value_is_null);
    }

}
