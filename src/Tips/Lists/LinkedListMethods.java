package Tips.Lists;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        /*
        LinkedList is used to manipulate data

        LinkedList<Type> listName = new LinkedList<>();
        listName.add(element);
        listName.add(element);
        ...
         */

        LinkedList<String> cars = new LinkedList <>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);

//        Get first element: listName.getFirst();
        System.out.println("The first element is: " + cars.getFirst());

//        Get last element: listName.getLast();
        System.out.println("The last element is: " + cars.getLast());

//        Insert element to the beginning of the list: listName.addFirst(element);
        cars.addFirst("Citroen");
        System.out.println("Added element to the beginning \"Citroen\": " + cars);

//        Insert element to the end of the list: listName.addLast(element);
        cars.addLast("Opel");
        System.out.println("Added element to the end \"Opel\": " + cars);

//        Remove first element: listName.removeFirst();
        cars.removeFirst();
        System.out.println("Removed first element \"Citroen\": " + cars);

//        Remove last element: listName.removeLast();
        cars.removeLast();
        System.out.println("Removed last element \"Opel\":" + cars);
    }
}