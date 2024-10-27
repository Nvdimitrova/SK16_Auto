package Exercises_05;

import java.util.HashSet;

public class PartyGuestList {
    public static void main(String[] args) {
        HashSet<String> guestList = new HashSet<>();
        guestList.add("Nikol");
        guestList.add("Petar");
        guestList.add("Ivana");
        guestList.add("Konstantin");
        guestList.add("Martina");
        guestList.add("Lubomir");

        System.out.println("Primary guest list: " + guestList);

        boolean isAdded = guestList.add("Petar");
        System.out.println("Trying to add Petar again: "
                + ((isAdded) ? "Successfully added!" : "Already on the list!"));

        guestList.remove("Nikol");
        System.out.println("Nikol can't attend the party.\nUpdated guest list: " + guestList);

        boolean isGuest = guestList.contains("Kalina");
        System.out.println("Checking if Kalina is a guest: "
                + ((isGuest) ? "Kalina is on the guest list"
                : "Kalina is not on the guest list."));

        System.out.println("Final guest list: " + guestList);
    }
}