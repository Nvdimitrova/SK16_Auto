package Exercises_10.SecondExercise;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee(5, "Ivana", "Doganova", 3000);

        System.out.println(firstEmployee);
        System.out.println("Full Name: " + firstEmployee.getName());
        System.out.println("Annual Salary: $" + firstEmployee.getAnnualSalary());

        firstEmployee.raiseSalary(10);
        System.out.println("Updated Salary after raise: $" + firstEmployee.getSalary());

        System.out.println(firstEmployee);
    }
}