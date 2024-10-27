package Tips.HashSet;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {

        /*
        HashSet is a collection of items where every item is unique

        HashSet<Type> hashSetName = new HashSet<>();
        hashSetName.add(element);
        hashSetName.add(element);
        ...
         */

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");
        cars.add("BMW");

        System.out.println(cars);

//        Find out many elements a HashMap have: hashSetName.size();
        System.out.println("Elements in the HashMap: " + cars.size());

//        Check if an element exist: hashSetName.contains(element);
        System.out.println("Does element \"Mazda\" exist: " + cars.contains("Mazda"));

//        Print all elements:
        for (String i : cars) {
            System.out.println(i);
        }
//        Remove an element: hashSetName.remove(element);
        cars.remove("Volvo");
        System.out.println("Removed element \"Volvo\": " + cars);

//        Remove all elements: hashSetName.clear();
        cars.clear();
        System.out.println("All elements removed: " + cars);
    }
}