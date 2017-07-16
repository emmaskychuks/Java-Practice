package com.emmasky;

/**
 * Created by emmas on 6/12/2017.
 */
public class HealthyBurger extends HamBurger
{
    double price;
    int additions;
    double grandTotal;

    public double getGrandTotal() {
        return grandTotal;
    }

    public HealthyBurger(String meatType, int _price)
    {
        super("Healthy Burger","Brown Rye Bread", meatType, _price);
        price = 0.0;
        additions = 0;
        grandTotal = super.getPrice();
    }
    public void addToppings(String _topping, int _price)
    {
        if(additions <= 2)
        {
            Toppings topping = new Toppings(_topping, _price);
            additions++;
            price += topping.getPrice();
            grandTotal+= price;
        }
        else
            System.out.println("Healthy Burger doesn't support more additions");
    }
}
