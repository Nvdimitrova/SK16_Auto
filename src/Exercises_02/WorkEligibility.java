package Exercises_02;

import java.util.Scanner;

public class WorkEligibility {
    public static void main(String[] args) {
        System.out.println("Please, enter your age:");
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());

        if (years < 16) {
            System.out.println("You are not eligible to work.");
        } else {
            System.out.println("You are eligible to work.");
        }
        scanner.close();
    }
}