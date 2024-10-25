package Exercises_02;

import java.util.Scanner;

public class VacationPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter type of vacation: ");
        String typeOfVacation = scanner.nextLine();
        System.out.print("Please, enter number of days: ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.print("Please, enter number of people: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Please, enter budget: ");
        double budget = Double.parseDouble(scanner.nextLine());

        double dailyBudget = budget / (days * people);

        String bulgariaDestinationMessage = "Available destination: Bulgaria";
        String nonBulgariaDestinationMessage = "Available destination: Outside Bulgaria";

        switch (typeOfVacation) {
            case "Beach":
                if (dailyBudget >= 50) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
            case "Mountain":
                if (dailyBudget >= 30) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
            default:
                System.out.println("There is no information about this type of vacation.");
        }
        scanner.close();
    }
}