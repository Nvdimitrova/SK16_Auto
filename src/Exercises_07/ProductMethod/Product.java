package Exercises_07.ProductMethod;

public class Product {
    String productName;
    double price;
    String category;
    int quantity;
    Boolean isOnSale;

    public Product(String productName, double price, String category, int quantity) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.isOnSale = false;
    }

    public void putOnSale() {
        this.isOnSale = true;
    }

    public double priceWithDiscount() {
        if (isOnSale && price > 100) {
            return price * 0.9;
        }
        return price;
    }

    public void printProductDetails() {
        System.out.println("Product name: " + productName);
        System.out.println("Category: " + category);
        if (isOnSale) {
            System.out.printf("Total price with discount: $%.2f", priceWithDiscount());
        } else {
            System.out.printf("Total price: $%.2f", price);
        }
        System.out.println();
    }
}