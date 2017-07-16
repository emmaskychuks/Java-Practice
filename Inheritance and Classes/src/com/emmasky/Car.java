package com.emmasky;

/**
 * Created by emmas on 5/20/2017.
 */
public class Car extends Vehicle
{
    private String name;
    private int door;
    private int gear;
    private int wheels;

    @Override
    public void drive() {
        System.out.println("Car Driving");
    }
    public void changeGear(int gear)
    {
        this.gear = gear;
        System.out.println("Gear changed to " + this.gear);
    }

    public Car(int handSteering, int speed, String name, int door, int wheels) {
        super(handSteering, speed);
        this.name = name;
        this.door = door;
        this.wheels = wheels;
    }
}
