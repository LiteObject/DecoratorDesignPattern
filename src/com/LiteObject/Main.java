package com.LiteObject;

/*
* "Decorator pattern (also known as Wrapper, an alternative naming shared with the Adapter pattern) is a design pattern
* that allows behavior to be added to an individual object, either statically or dynamically, without affecting the
* behavior of other objects from the same class" - Wiki
*
* "Component" is defined by the Vehicle interface class
* "Concrete Component" is defined by the BaseModelCar class
* "Decorator" is defined by the PackageDecorator abstract class
* "Concrete Decorator" is by LuxuryPackage and PremiumPackage classes
* */
public class Main {

    public static void main(String[] args) {
        // adding both Premium and Luxury features (you may not do this in real life)
        Vehicle myCar = new PremiumPackage(new LuxuryPackage(new BaseModelCar()));
        System.out.println("Year, Make, Model: " + myCar.getYearMakeModel());
        System.out.println("Features : " + myCar.getFeatures()); // will show all features
        System.out.println("Total Price : " + myCar.getPrice()); // will display total price after adding all features
    }
}
