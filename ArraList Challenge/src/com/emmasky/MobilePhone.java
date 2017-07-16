package com.emmasky;

import java.util.ArrayList;

/**
 * Created by emmas on 6/19/2017.
 */
public class MobilePhone
{
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact)
    {
        int position = findContact(contact);
        if(position < 0) {
            contacts.add(contact);
            System.out.println("Contact was successfully added");
        }
        else
            System.out.println("Contact already exists");
    }

    public void modifyExistingContact(Contact oldContact, Contact newContact)
    {
        int position = findContact(oldContact);
        if(position >= 0) {
            contacts.set(position, newContact);
            System.out.println("Contact was updated successfully");
        }
        else
            System.out.println("Contact doesn't exist");
    }

    private int findContact(Contact contact)
    {
        String oldName;
        String newName;
        String oldNumber;
        String newNumber;
        for(Contact person:contacts)
        {
            oldName = person.getName();
            newName = contact.getName();
            oldNumber = person.getMobileNumber();
            newNumber = contact.getMobileNumber();

            if(oldName.equals(newName) && oldNumber.equals(newNumber))
            {
                return contacts.indexOf(person);
            }
        }
        return -1;
    }

    public void searchForContact(Contact contact)
    {
        int position = contacts.indexOf(contact);
        if(position >= 0)
            System.out.println("Contact found");
        else
            System.out.println("Contact was not found!");
    }

    public  void removeContact(Contact contact)
    {
        int position = findContact(contact);
        if(position >= 0) {
            contacts.remove(position);
            System.out.println("Contact was successfully removed");
        }
        else
            System.out.println("Contact doesn't exist");
    }
    public void printAllContacts() {
        if (contacts.isEmpty())
        {
            System.out.println("Your contact list is empty");
        }

        else
        {
            for (Contact contact : contacts)
            {
                System.out.println("Name: " + contact.getName() + " | Mobile Number: " + contact.getMobileNumber());
            }
        }
    }
}
