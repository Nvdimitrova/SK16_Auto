package Exercises_02;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        System.out.print("Please, enter a day of the week: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The" + day + "-th day of the week is Tuesday.");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday.");
            default:
                System.out.println("Invalid day:" + day + " Please, enter a number between 1-7.");
        }
        scanner.close();
    }
}