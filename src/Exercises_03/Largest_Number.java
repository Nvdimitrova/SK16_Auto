package Exercises_03;

public class Largest_Number {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 17, 21, 14, 33};
        int largest = numbers [0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);

        }
    }