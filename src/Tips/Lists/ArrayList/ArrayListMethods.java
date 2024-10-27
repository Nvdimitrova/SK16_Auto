package Tips.Lists.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);

//        Find out how many elements an ArrayList have: listName.size();
        System.out.println("Elements in the ArrayList: " + cars.size());

//       Access an element: listName.get(index);
        System.out.println("The element at index 3 is: " + cars.get(3));

//        Change an element: listName.set(index, new element);
        cars.set(1, "Opel");
        System.out.println("Changed element \"BMW\" to \"Opel\": " + cars);

//        Insert element on a specified position: listName.add(index,element);
        cars.add(0, "Citroen");
        System.out.println("Inserted element \"Citroen\": " + cars);

//        Remove an element: listName.remove(index);
        cars.remove(2);
        System.out.println("Removed \"Opel\": " + cars);

//        Remove all elements: listName.clear();
        cars.clear();
        System.out.println("All elements removed: " + cars);
    }
}