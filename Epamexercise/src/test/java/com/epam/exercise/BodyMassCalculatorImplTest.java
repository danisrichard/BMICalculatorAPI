package com.epam.exercise;

import com.epam.exercise.implementation.BodyMassCalculatorImpl;
import com.epam.exercise.response.BodyMassIndexResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BodyMassCalculatorImplTest {


    BodyMassCalculatorImpl component;

    @Before
    public void setUp() throws Exception {
        component = new BodyMassCalculatorImpl();
    }

    @Test
    public void calculateBMIwithZEROParam() throws Exception {
        BodyMassIndexResponse param = component.calculate(0,0);
        Assert.assertEquals(-1.0,param.getBodyMassIndex(),0);
    }

    @Test
    public void calculateBMIwithNegativeParam() throws Exception{
        BodyMassIndexResponse param =  component.calculate(-1,10);
        Assert.assertEquals(-1.0,param.getBodyMassIndex(),0);

    }


    @Test
    public void calculateBMIwithMetric() throws Exception{
        BodyMassIndexResponse param = component.calculate(1.78,72.5);
        Assert.assertEquals(22.8,param.getBodyMassIndex(),1);
    }

    @Test
    public void calcaulteBMIwithUnitMetric() throws Exception{
        BodyMassIndexResponse param = component.calculate(5,20,160);
        Assert.assertEquals(17.5,param.getBodyMassIndex(),1);
    }
}