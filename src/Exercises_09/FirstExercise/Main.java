package Exercises_09.FirstExercise;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8.9);
        circle.printArea();

        System.out.println();

        Shape rectangle = new Rectangle(10.1, 5.3);
        rectangle.printArea();
    }
}