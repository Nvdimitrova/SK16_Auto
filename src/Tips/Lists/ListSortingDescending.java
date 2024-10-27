package Tips.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortingDescending {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println("Not sorted: " + cars);

//        Sorting elements descending: listName.sort(Collections.reverseOrder());
        cars.sort(Collections.reverseOrder());
        System.out.println("Sorted descending: " + cars);
    }
}