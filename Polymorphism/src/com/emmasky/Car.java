package com.emmasky;

/**
 * Created by emmas on 6/9/2017.
 */
public class Car
{
    private  String name;
    private boolean hasEngine;
    private int cylinders;
    private int wheels;
    private int maxSpeed;

    public Car(int _cylinders, String _name, int _maxSpeed)
    {
        cylinders = _cylinders;
        name = _name;
        wheels = 4;
        maxSpeed = _maxSpeed;
        hasEngine = true;
    }

    public void accelerate()
    {
        System.out.println("Car is now moving");
    }
    public void startEngine()
    {
        System.out.println("Engine started!");
    }
    public void brake()
    {
        System.out.println("Car is stopping");
    }

}

class BugattiVeyron extends Car
{
    BugattiVeyron(int _cylinders, String _name, int _maxSpeed)
    {
        super(_cylinders, _name, _maxSpeed);
    }
    public void accelerate()
    {
        System.out.println("Bugatti Car is now moving");
    }
    public void startEngine()
    {
        System.out.println("Engine started!");
    }
    public void brake()
    {
        System.out.println("Bugatti Car is stopping");
    }
}


class FordExplorer extends Car
{
    FordExplorer(int _cylinders, String _name, int _maxSpeed)
    {
        super(_cylinders, _name, _maxSpeed);
    }
}
