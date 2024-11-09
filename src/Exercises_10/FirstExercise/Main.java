package Exercises_10.FirstExercise;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8.9);
        System.out.printf("The area of the circle is: %.2f ", circle.getArea());
        System.out.printf("\nThe perimeter of the circle is: %.2f ", circle.getPerimeter());

        System.out.println();

        Shape rectangle = new Rectangle(10.1, 5.3);
        System.out.printf("The area of the rectangle is: %.2f ", rectangle.getArea());
        System.out.printf("\nThe perimeter of the rectangle is: %.2f ", rectangle.getPerimeter());
    }
}