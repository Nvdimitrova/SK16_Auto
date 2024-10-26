package Tips.WhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        /*
        The do/while loop will always be executed at least once

        do {
            // code block to be executed
        }
        while (condition);
         */

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
