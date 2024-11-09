package Exercises_02;

import java.util.Scanner;

public class BuiltTriangle {
    public static void main(String[] args) {
        float firstAngle, secondAngle, thirdAngle;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for first angle: ");
        firstAngle = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter value for second angle: ");
        secondAngle = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter value for third angle: ");
        thirdAngle = Float.parseFloat(scanner.nextLine());

        String message = "Triangle can be build! The type of the triangle is: ";

        float sumOfAngles = firstAngle + secondAngle + thirdAngle;

        if (sumOfAngles != 180) {
            System.out.println("Cannot build triangle with these angles.");
        } else if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
            System.out.println(message + "Equilateral");
        } else if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
            System.out.println(message + "Right-angled");
        } else if (firstAngle > 90 || secondAngle > 90 || thirdAngle > 90) {
            System.out.println(message + "Obtuse");
        } else if (firstAngle < 90 && secondAngle < 90 && thirdAngle < 90) {
            System.out.println(message + "Acute");
        } else if (firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle) {
            System.out.println(message + "Isosceles");
        } else {
            System.out.println(message + "Multifaceted");
        }
    }
}