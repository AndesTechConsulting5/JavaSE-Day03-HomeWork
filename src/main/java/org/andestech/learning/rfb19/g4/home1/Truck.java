package org.andestech.learning.rfb19.g4.home1;

public class Truck extends Car {
    double trailerM, trailerLenght;

    public Truck(double trailerM) {
        System.out.println("+++ctro ");
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("truck drive");
    }
}
