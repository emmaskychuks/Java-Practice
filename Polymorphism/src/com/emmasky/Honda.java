package com.emmasky;

class Honda extends Car
{
    Honda(int _cylinders, String _name, int _maxSpeed)
    {
        super(_cylinders, _name, _maxSpeed);
    }
    public void accelerate()
    {
        System.out.println("Honda Car is now moving");
    }
    public void startEngine()
    {
        System.out.println("Honda started!");
    }
    public void brake()
    {
        System.out.println("Honda Car is stopping");
    }
}


