package com.LiteObject;

/**
 * Created by M on 2/12/2015.
 * ConcreteDecorator: Adds features to the component.
 */
public class PremiumPackage extends PackageDecorator {

    public PremiumPackage(Vehicle car){
        super(car);
        System.out.println("Added Premium Package");
    }

    @Override
    public String getYearMakeModel() {
        return super.car.getYearMakeModel();
    }

    @Override
    public String getFeatures() {
        return super.car.getFeatures() + ", Premium Features: Genuine wood accents, Power tilt-and-telescopic steering wheel, Lexus Memory System";
    }

    @Override
    public double getPrice() {
        return super.car.getPrice() + 1000.00;
    }
}
