package com.emmasky;

/**
 * Created by emmas on 6/13/2017.
 */
public class DeluxeBurger extends HamBurger
{
    private int additions;
    private double price;
    private double grandTotal;

    public int getAdditions() {
        return additions;
    }


    public DeluxeBurger(String breadType, String meatType, int _price)
    {
        super("DeluxeBurger", breadType, meatType, _price);

        price = 0;
        additions = 0;
        grandTotal = super.getPrice();
        addToppings("Chips", 5);
        addToppings("Drinks", 5);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void addToppings(String _topping, int _price)
    {
        if(additions < 2)
        {

            Toppings topping = new Toppings(_topping, _price);
            additions++;
            price += topping.getPrice();
            grandTotal+= price;
        }
        else
            System.out.println("Deluxe Burger doesn't support more additions");
    }
}
