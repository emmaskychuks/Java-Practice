package com.company;

import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank("Chase Bank");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        bank.addBranch("Chase Michigan");
        bank.addBranch("Chase Ohio");
        bank.addCustomer("Emmanuel", "Chase Michigan", 100.00);
        bank.addCustomerTransaction("Emmanuel", "Chase Michigan", 1000);
        bank.addCustomer("Emily", "Chase Michigan", 100.00);
        bank.addCustomer("John", "Chase Ohio", 500.00);
        bank.displayListOfCustomers("Chase Michigan", true);
        bank.displayListOfCustomers("Chase Ohio", true);

        //Error
        bank.addCustomer("John", "Chase Canada", 500.00);

    }
}
