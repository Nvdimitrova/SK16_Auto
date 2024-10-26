package Exercises_02;

import java.util.Scanner;

public class SalesRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter unit price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Please, enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        double discount = 1;
        char currency = '$';

        if (quantity >= 100 && quantity <= 120) {
            discount = 0.15;
        } else if (quantity > 120) {
            discount = 0.2;
        }

        double totalPrice = quantity * price;
        double discountAmount = (quantity * price) * discount;
        double finalRevenue = totalPrice - discountAmount;

        System.out.println("The revenue from sale is: " + finalRevenue + currency);
        System.out.println("Discount is: " + discountAmount + currency);

        scanner.close();
    }
}