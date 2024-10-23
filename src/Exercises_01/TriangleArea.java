package Exercises_01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter side a");
        double sideA = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, enter height");
        double height = Double.parseDouble(scanner.nextLine());

        double area = (sideA * height) / 2;

        System.out.println("The area is: " + area);

        scanner.close();
    }
}