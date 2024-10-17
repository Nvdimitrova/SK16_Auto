package Exercises_02;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three angles from the user
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();

        // Check if the sum of angles is exactly 180
        if (angle1 + angle2 + angle3 == 180) {
            // The triangle can be built, now determine its type
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is right-angled (Правоъгълен).");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("The triangle is obtuse (Тъпоъгълен).");
            } else {
                System.out.println("The triangle is acute (Остроъгълен).");
            }

            // Check if the triangle is equilateral, isosceles, or multifaceted
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("The triangle is equilateral (Равностранен).");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("The triangle is isosceles (Равнобедрен).");
            } else {
                System.out.println("The triangle is multifaceted (Разностранен).");
            }
        } else {
            // If the angles don't add up to 180, the triangle can't be formed
            System.out.println("A triangle cannot be built with these angles.");
        }
        scanner.close();
    }
}

