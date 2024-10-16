package Exercises_02;

import java.util.Scanner;

public class Sales_Revenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Initialize discount variables
        double discountRate = 0.0;

        // Determine the discount rate based on quantity
        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;  // 15% discount
        } else if (quantity > 120) {
            discountRate = 0.20;  // 20% discount
        }

        // Calculate total price and discount
        double totalPrice = unitPrice * quantity;
        double discountAmount = totalPrice * discountRate;
        double finalRevenue = totalPrice - discountAmount;

        // Output the results
        System.out.println("The revenue from sale: " + finalRevenue + "$");
        if (discountRate > 0) {
            System.out.println("Discount: " + discountAmount + "$ (" + (discountRate * 100) + "%)");
        }
        scanner.close();
    }
}

