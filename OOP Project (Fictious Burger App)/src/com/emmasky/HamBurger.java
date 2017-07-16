package com.emmasky;

/**
 * Created by emmas on 6/12/2017.
 */
public class HamBurger
{
    private String breadRollType;
    private String meatType;
    private String name;
    private double price;
    private int additions;

    public double getPrice() {
        return price;
    }

    public HamBurger(String _name, String _breadRollType, String _meatType, int _price)
    {
        name = _name;
        breadRollType = _breadRollType;
        meatType = _meatType;
        price = _price;
    }
    public void addToppings(String _topping, double _price)
    {
        Toppings topping = new Toppings(_topping, _price);
        additions++;
        price += topping.getPrice();
    }
}
