package Exercises_03;

public class FirstMultiple {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 25, 30, 44, 71, 105, 215};
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("The first multiple of 5 is: " + number);
                break;
            }
        }
    }
}