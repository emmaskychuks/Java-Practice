package com.emmasky;

public class Main {

    public static void main(String[] args)
    {
        HamBurger hamBurger = new HamBurger("Basic","White Bread", "Chicken", 50);
        DeluxeBurger deluxeBurger = new DeluxeBurger("White Bread", "Steak", 50);
        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 150);

        System.out.println(hamBurger.getPrice());
        System.out.println(deluxeBurger.getGrandTotal());
        System.out.println(healthyBurger.getGrandTotal());

        deluxeBurger.addToppings("lettuce", 15);
        deluxeBurger.addToppings("Cheese", 15);

        healthyBurger.addToppings("lettuce", 5);
        healthyBurger.addToppings("Cheese", 5);

        System.out.println(hamBurger.getPrice());
        System.out.println(deluxeBurger.getGrandTotal());
        System.out.println(healthyBurger.getGrandTotal());
    }
}
