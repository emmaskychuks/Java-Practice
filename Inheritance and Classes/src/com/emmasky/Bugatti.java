package com.emmasky;

/**
 * Created by emmas on 5/20/2017.
 */
public class Bugatti extends Car
{
    String engine;
    String model;

    public Bugatti(int handSteering, int speed, String name, int door, int wheels, String engine, String model) {
        super(handSteering, speed, name, door, wheels);
        this.engine = engine;
        this.model = model;
    }

    public void drive(int speed) {
        System.out.println("Car driving at " + speed + " MPH");
    }
}
