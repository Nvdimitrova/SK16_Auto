package Tips.Methods;

public class MethodOverloading {
    public static void main(String[] args) {

        /*
        With method overloading, multiple methods
        can have the same name with different parameters
         */

        int sumTwoIntegerNumbers = sumTwoNumbers(7, 3);
        double sumTwoDoubleNumbers = sumTwoNumbers(7.3, 3.7);

        System.out.println("Integer: " + sumTwoIntegerNumbers);
        System.out.println("Double: " + sumTwoDoubleNumbers);
    }

    public static int sumTwoNumbers(int x, int y) {
        return x + y;
    }

    public static double sumTwoNumbers(double x, double y) {
        return x + y;
    }
}