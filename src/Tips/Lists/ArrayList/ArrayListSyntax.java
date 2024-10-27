package Tips.Lists.ArrayList;

import java.util.ArrayList;

public class ArrayListSyntax {
    public static void main(String[] args) {

        /*
        ArrayList is used for storing and accessing data

        ArrayList<Type> listName = new ArrayList<>();
        listName.add(element);
        listName.add(element);
        ...
         */

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);
    }
}