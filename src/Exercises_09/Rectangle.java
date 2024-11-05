package Exercises_09;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return width * height;
    }

    @Override
    public void printArea() {
        System.out.printf("The area of the rectangle is: %.2f", shapeArea());
    }
}