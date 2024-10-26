package Tips.Arrays;

public class Arrays {
    public static void main(String[] args) {

        /*
        Arrays are used to store multiple values in a single variable,
                instead of declaring separate variables for each value.
         */

        String[] cars = new String[4];
        cars [0] = "Volvo";
        cars [1] = "BMW";
        cars [2] = "Ford";
        cars [3] = "Mazda";
        System.out.println(java.util.Arrays.toString(cars));

        /*
        Is the same as:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(java.util.Arrays.toString(cars));
         */
    }
}