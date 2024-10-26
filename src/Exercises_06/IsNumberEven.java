package Exercises_06;

public class IsNumberEven {
    public static void main(String[] args) {
        boolean number = isEven(5);
        System.out.println(number);
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;
    }
}