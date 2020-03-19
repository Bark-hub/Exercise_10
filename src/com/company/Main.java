package com.company;

import java.util.*;

// Mubarik Abdi 3/18/2020
// Hi Mr.k, you were right on exercise eight, I was making collections harder than they are.
// How is break? Hope you and your family is safe.
// I did not go to school on thursday because I was sick then I was told school is off!

public class Main extends Collection {


    public static void main(String[] args) {

        System.out.println("Hello, these are the Contacts in your Phone Book.\n");
        // Here is an object of my Collection class I called contactBook.
        Collection contactBook = new Collection();

        // Below are objects of the contact class.
        Contact person1 = new Contact("Joey Tribiany", "Friends4eva@gmail.com");
        Contact person2 = new Contact("Ross Geller", "CoolScientatist@gmail.com");
        Contact person3 = new Contact("Rachel Green", "TheQueen@gmail.com");

        // Here is the contacts being put into the contactBook,
        // go to the Collection class to see the method responsible for this.
        contactBook.addContact(person1);
        contactBook.addContact(person2);
        contactBook.addContact(person3);

        // Lastly, here is the display method which is given an implementation in the Collection class.
        // Originally, the display method is from the iterable Interface.
        contactBook.display();
    }


}
