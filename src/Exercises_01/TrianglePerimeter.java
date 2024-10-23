package Exercises_01;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter side A");
        double sideA = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, enter side B");
        double sideB = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, enter side C");
        double sideC = Double.parseDouble(scanner.nextLine());

        double perimeter = sideA + sideB + sideC;

        System.out.println("The perimeter is: " + perimeter);

        scanner.close();
    }
}