package Tips.ForLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
        for (type variableName : arrayName) {
            // code block to be executed
        }
         */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}