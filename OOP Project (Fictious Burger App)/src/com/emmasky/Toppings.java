package com.emmasky;

/**
 * Created by emmas on 6/12/2017.
 */
public class Toppings
{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Toppings(String _name, double _price)
    {
        name = _name;
        price = _price;
    }
}
