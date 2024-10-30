package Exercises_07;

public class ProductDetails {
    public static void main(String[] args) {
        Product productDetails = new Product("Lady Million", 119.99, "perfumes", 1);
        System.out.println("First product details: ");
        productDetails.printProductDetails();

        System.out.println();

        Product secondProduct = new Product("One Million", 213.03, "perfumes", 1);
        secondProduct.putOnSale();
        System.out.println("\nSecond product details: ");
        secondProduct.printProductDetails();
    }
}