package Exercises_02;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter degrees to convert: ");
        double degrees = Double.parseDouble(scanner.nextLine());
        System.out.print("Please, enter 'C' to convert to Fahrenheit or 'F' to convert to Celsius: ");
        String convertDegrees = scanner.nextLine();

        double fahrenheit = 0;
        double celsius = 0;

        if (convertDegrees.equals("C")) {
            fahrenheit = (degrees * 9 / 5) + 32;
            System.out.println(degrees + " Celsius is equal to" + fahrenheit + " Fahrenheit");
        } else if (convertDegrees.equals("F")) {
            celsius = (degrees - 32) * 5 / 9;
            System.out.println(degrees + " Fahrenheit is equal to" + celsius + " Celsius");
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}