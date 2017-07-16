package com.company;


import java.util.ArrayList;

public class Bank
{
    private String bankName;
    private ArrayList<Branch> bankBranches;

    public Bank(String name)
    {
        bankName = name;
        bankBranches = new ArrayList<Branch>();

    }

    public void addBranch(String branchName)
    {
        Branch branch = new Branch(branchName);
        bankBranches.add(branch);
    }

    public void addCustomer(String customerName, String branchName, double transaction)
    {
        boolean branchFound = false;
        for(Branch branch : bankBranches)
        {
            if(branch.getBranchName().equals(branchName))
            {
                branchFound = true;
                branch.addCustomer(customerName, transaction);
                break;
            }
        }
        if(branchFound == false)
            System.out.println("Branch not found!");
    }
    public void addCustomerTransaction(String customerName, String branchName, double transaction)
    {
        boolean customerFound = false;
        for(Branch branch : bankBranches)
        {
            if(branch.getBranchName().equals(branchName))
            {
                for(Customer customer : branch.getBranchCustomers())
                {
                    if(customer.getName().equals(customerName))
                    {
                        customerFound = true;
                        customer.addTransactions(transaction);
                        break;
                    }
                }
                if(customerFound == false){
                    System.out.println("Customer doesn't exist, try again!");
                }
            }
            break;
        }
    }

    public void displayListOfCustomers(String branchName, boolean showTransactions)
    {
        int count;
        if(showTransactions)
        {
            for (Branch branch : bankBranches)
            {
                if(branch.getBranchName().equals(branchName))
                {
                    System.out.println(branch.getBranchName() + " : ");
                    for (Customer customer : branch.getBranchCustomers()) {
                        count = 1;
                        System.out.println("\tCustomer Name: " + customer.getName());
                        for (double transaction : customer.getBankTransactions()) {
                            System.out.println("\t\tTransaction " + count + " : " + transaction);
                            count++;
                        }
                    }
                    break;
                }
            }
        }
        else
        {
            for (Branch branch : bankBranches)
            {
                if(branch.getBranchName().equals(branchName))
                {
                    System.out.println(branch.getBranchName() + " : ");
                    for (Customer customer : branch.getBranchCustomers()) {
                        System.out.println("\tCustomer Name: " + customer.getName());
                    }
                    break;
                }

            }
        }
    }

}
