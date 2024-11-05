package Exercises_09;

public class CalculateTheAreaOfShape {
    public static void main(String[] args) {
        Shape circle = new Circle(8.9);
        Shape rectangle = new Rectangle(10.1, 5.3);

        circle.printArea();
        System.out.println();
        rectangle.printArea();
    }
}
