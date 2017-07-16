package com.company;

import java.util.ArrayList;

/**
 * Created by emmas on 7/1/2017
 */
public class Branch
{
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    private int searchLocation(Customer customer)
    {
        for(Customer existingCustomer: branchCustomers)
        {
            if(customer.getName().equals(existingCustomer.getName()))
                return branchCustomers.indexOf(existingCustomer);
        }

        return -1;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public Branch(String nameOfBranch)
    {
        branchName = nameOfBranch;
        branchCustomers = new ArrayList<Customer>();
    }
    public void addCustomer(String customerName, double initialTransaction)
    {
        Customer customer = new Customer(customerName);
        int searchPosition = searchLocation(customer);

        if(searchPosition < 0)
        {
            customer.addTransactions(initialTransaction);
            branchCustomers.add(customer);

        }
        else
            System.out.println("Customer already exist!");
    }
}
