package com.emmasky;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args)
    {
        int choice;
        boolean stop = false;
        displayAllOptions();

        while(!stop)
        {
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    displayAllOptions();
                    break;
                case 7:
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    displayAllOptions();
                    break;
            }
        }
    }

    public static void displayAllOptions()
    {
        System.out.println("Type 1 to add a contact");
        System.out.println("Type 2 to remove a contact");
        System.out.println("Type 3 to update an existing contact");
        System.out.println("Type 4 to print all list of contacts");
        System.out.println("Type 5 to search for a contact");
        System.out.println("Type 6 to display all options");
        System.out.println("Type 7 to quit");
    }
    public static void add()
    {
        System.out.println("Please enter the name and the phone number of the new contact, space them by one line");
        Contact contact = new Contact(scanner.next(), scanner.next());
        mobilePhone.addContact(contact);
    }
    public static void remove()
    {
        System.out.println("Please enter the name and the phone number of the contact to delete, space them by one line");
        Contact contact = new Contact(scanner.next(), scanner.next());
        mobilePhone.removeContact(contact);
    }
    public static void updateContact()
    {
        System.out.println("Please enter the name and the phone number of the contact to update, space them by one line");
        Contact oldContact = new Contact(scanner.next(), scanner.next());
        System.out.println("Please enter the  updated name and the phone number of the contact, space them by one line");
        Contact newContact = new Contact(scanner.next(), scanner.next());
        mobilePhone.modifyExistingContact(oldContact, newContact);
    }
    public static void print()
    {
        mobilePhone.printAllContacts();
    }
    public static void searchForContact()
    {
        System.out.println("Please enter the name and the phone number of the contact to delete, space them by one line");
        Contact contact = new Contact(scanner.next(), scanner.next());
        mobilePhone.searchForContact(contact);
    }
}
