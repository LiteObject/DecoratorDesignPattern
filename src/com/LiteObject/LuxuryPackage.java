package com.LiteObject;

/**
 * Created by M on 2/12/2015.
 * ConcreteDecorator: Adds features to the component.
 */
public class LuxuryPackage extends PackageDecorator  {

    public LuxuryPackage(Vehicle car){
        super(car);
        System.out.println("Added Luxury Package");
    }

    @Override
    public String getYearMakeModel() {
        return super.car.getYearMakeModel();
    }

    @Override
    public String getFeatures() {
        return super.car.getFeatures() + ", Luxury Features: Perforated leather trim, Genuine wood accents, Heated and ventilated front seats, Lexus Memory System";
    }

    @Override
    public double getPrice() {
        return super.car.getPrice() + 1500.00;
    }
}
