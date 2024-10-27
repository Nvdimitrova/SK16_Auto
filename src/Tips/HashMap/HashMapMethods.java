package Tips.HashMap;

import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {

                /*
              index, object
        HashMap<key, value> hashMapName = new HashMap<>();
        hashMapName.put(key, value);
        hashMapName.put(key, value);
        ...
         */

        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities);

//        Find out many elements a HashMap have: hashMapName.size();
        System.out.println("Elements in the HashMap: " + capitalCities.size());

//        To print all keys use: hashMapName.keySet();
        for (String i : capitalCities.keySet()) {
            System.out.println("Keys: " + i);
        }

//        To print all values use: hashMapName.values();
        for (String i : capitalCities.values()) {
            System.out.println("Values: " + i);
        }

//        Access an item: hashMapName.get(key);
        System.out.println("The capital city of England is: " + capitalCities.get("England"));

//        Remove an item: hashMapName.remove(key);
        capitalCities.remove("England");
        System.out.println("Removed item \"England\": " + capitalCities);

//        Remove all items: hashMapName.clear();
        capitalCities.clear();
        System.out.println("All elements removed: " + capitalCities);
    }
}