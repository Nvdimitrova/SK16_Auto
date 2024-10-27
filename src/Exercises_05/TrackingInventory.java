package Exercises_05;

import java.util.HashMap;

public class TrackingInventory {
    public static void main(String[] args) {
        HashMap<String, Integer> storeInventory = new HashMap<>();
        storeInventory.put("Eggs", 30);
        storeInventory.put("Oil", 15);
        storeInventory.put("Bread", 17);
        storeInventory.put("Milk", 10);
        storeInventory.put("Pasta", 20);

        System.out.println("Primary inventory: " + storeInventory);

        System.out.println("Checking quantity of Pasta: "
                + storeInventory.get("Pasta") + " units");

        storeInventory.put("Oil", storeInventory.get("Oil") + 7);
        System.out.println("Increased quantity of bottles of Oil: "
                + storeInventory.get("Oil") + " units");

        storeInventory.put("Pasta", 0);
        System.out.println("Pasta is out of stock. Updated inventory: " + storeInventory);
        storeInventory.remove("Pasta");

        System.out.println("Final inventory list: " + storeInventory);
    }
}