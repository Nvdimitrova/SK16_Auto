package Exercises_09;

import static java.lang.Math.PI;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return PI * (radius * radius);
    }

    @Override
    public void printArea() {
        System.out.printf("The area of the circle is: %.2f ", shapeArea());
    }
}