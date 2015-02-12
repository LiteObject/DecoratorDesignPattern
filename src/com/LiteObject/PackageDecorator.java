package com.LiteObject;

/**
 * Created by M on 2/12/2015.
 * Decorator: Maintains a reference to a Component object and defines
 * an interface that conforms to Component's interface.
 */
public abstract class PackageDecorator implements Vehicle {

    protected Vehicle car;

    public PackageDecorator(Vehicle car){
        this.car = car;
    }

    @Override
    public String getYearMakeModel() {
        return this.car.getYearMakeModel();
    }

    @Override
    public String getFeatures() {
        return this.getFeatures();
    }

    @Override
    public double getPrice() {
        return this.getPrice();
    }
}
