package Tips.Lists.LinkedList;

import java.util.LinkedList;

public class LinkedListSyntax {
    public static void main(String[] args) {

        /*
        LinkedList is used to manipulate data

        LinkedList<Type> listName = new LinkedList<>();
        listName.add(element);
        listName.add(element);
        ...
         */

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);
    }
}