package Exercises_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        ArrayList<String> contactList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        contactList.add("Ivana");
        contactList.add("Martina");
        contactList.add("Kristian");

        System.out.println("Primary contact list: " + contactList);

        System.out.print("Please, enter a person, you want to add to the list: ");
        String addContact = scanner.nextLine();
        contactList.add(addContact);

        System.out.println(addContact + " is successfully added to the list!");
        System.out.println("Updated contact list: " + contactList);

        System.out.print("Please, enter a person, you want to remove from the list: ");
        String removeContact = scanner.nextLine();
        contactList.remove(removeContact);

        System.out.println(removeContact + " is successfully removed from the list!");
        System.out.println("Updated contact list: " + contactList);

        scanner.close();
    }
}