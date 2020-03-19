package com.company;

import java.util.*;

public class Collection implements Iterable{

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact individual){
        contacts.add(individual);
    }

    @Override
    public void display() {

        for (Contact person:contacts){
                System.out.println(person + "\n");
        }

    }

}
