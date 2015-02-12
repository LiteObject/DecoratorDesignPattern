package com.LiteObject;

/**
 * Created by M on 2/12/2015.
 * Concrete Component: Defines an object to which additional responsibilities can be attached.
 */
public class BaseModelCar implements Vehicle {
    @Override
    public String getYearMakeModel() {
        return "2015 Lexus ES 350";
    }

    @Override
    public String getFeatures(){
        return "Basic Features: Leather, Bluetooth, Heated Seats, Hands-Free Technology";
    }

    @Override
    public double getPrice() {
        return 40000.00;
    }
}
