package Tips.Arrays;

public class ForLoopThrowAnArray {
    public static void main(String[] args) {

        /*
        for (type variable : arrayname) {
            ...
        }

        The example below can be read like this: for each String element
        (called i - as in index) in cars, print out the value of i.
         */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}