package Exercises_03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        int randomNumber = (int)(Math.random() * 101);
        int randomNumber = random.nextInt(1, 101);
//      store user guess
        int userGuess = 0;

        do {
            System.out.print("Please, enter your guess between 1 and 100: ");
            userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You have guessed the randomNumber.");
            }
        } while (userGuess != randomNumber);
        scanner.close();
    }
}