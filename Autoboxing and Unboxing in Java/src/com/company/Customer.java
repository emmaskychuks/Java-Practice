package com.company;

import java.util.ArrayList;

/**
 * Created by emmas on 7/1/2017
 */
public class Customer
{
    private String name;
    private ArrayList<Double> bankTransactions;

    public Customer(String customerName)
    {
        name = customerName;
        bankTransactions = new ArrayList<>();
    }
    public void addTransactions(double transaction)
    {
        //Autoboxing
        bankTransactions.add(transaction);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getBankTransactions()
    {
        return bankTransactions;
    }
}
