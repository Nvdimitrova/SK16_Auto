package Tips.ForLoop;

public class NestedLoop {
    public static void main(String[] args) {

        /*
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
            for (statement 1; statement 2; statement 3)
                // code block to be executed
        }
         */

        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}