package Tips.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortingAscending {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println("Not sorted: " + cars);

//        Sorting elements ascending: Collections.sort(listName);
        Collections.sort(cars);
        System.out.println("Sorted ascending: " + cars);
    }
}