package Exercises_09.Area;

public class Rectangle extends Shape {
    double width;
    double height;

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