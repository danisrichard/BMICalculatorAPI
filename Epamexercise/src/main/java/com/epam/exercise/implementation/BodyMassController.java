package com.epam.exercise.implementation;

import com.epam.exercise.response.BodyMassIndexResponse;

/**
 * Calculates and returns a {@link BodyMassIndexResponse} for a person.
 *
 * @author Danis Richard
 * calculateBMI @param height need double and Meters, @param weigthInKG need double and kilogram type
 * calculateBMI @param heigthFeet in double and feet, @param heightInch in double and inch @param weightinpund
 * in double and pound
 *
 * @return kg/m2
 */

public interface BodyMassController {
    BodyMassIndexResponse calculate(double heightInMeter,double weightInKG);
    BodyMassIndexResponse calculate(double heightFeet,double  heightInch,double weightInPound);
}
