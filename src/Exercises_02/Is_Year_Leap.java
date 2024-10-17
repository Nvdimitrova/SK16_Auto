package Exercises_02;

import java.util.Scanner;

public class Is_Year_Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a year:");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
        scanner.close();
    }
}
