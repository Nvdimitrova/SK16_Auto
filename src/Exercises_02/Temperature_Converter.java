package Exercises_02;

import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        // Choose conversion direction
        System.out.print("Enter 'C' to convert to Fahrenheit or 'F' to convert to Celsius: ");
        char choice = scanner.next().charAt(0);

        // Perform conversion based on user's choice
        if (choice == 'C' || choice == 'c') {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else if (choice == 'F' || choice == 'f') {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }
        scanner.close();
    }
}