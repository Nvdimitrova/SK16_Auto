package Exercises_08;

import java.util.Scanner;

public class HandlingUserInputErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;

        while (true) {
            System.out.print("Please, enter an integer: ");
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                System.out.println("You entered: " + userInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please, try again.");
            }
        }

        scanner.close();
    }
}