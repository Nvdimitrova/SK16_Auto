package Exercises_03;

public class First_Multiple {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 17, 25, 30, 40};
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("The first multiple of 5 is: " + number);
                break;
            }
        }
    }
}
