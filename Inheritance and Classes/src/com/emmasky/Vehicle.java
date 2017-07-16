package com.emmasky;

/**
 * Created by emmas on 5/20/2017.
 */
public class Vehicle
{
    private int steering;
    private int speed;

    public Vehicle(int steering, int speed) {
        this.steering = steering;
        this.speed = speed;
    }

    public void drive()
    {
        System.out.println("Driving");
    }
}
