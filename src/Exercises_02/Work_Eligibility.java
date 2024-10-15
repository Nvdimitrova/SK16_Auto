package Exercises_02;

import java.util.Scanner;

public class Work_Eligibility {
    public static void main(String[] args) {
        System.out.println("Please, enter your age:");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();

        if (years < 16) {
            System.out.println("You are not eligible to work.");
        }

        else {
                System.out.println("You are eligible to work.");
            }
        }

    }
