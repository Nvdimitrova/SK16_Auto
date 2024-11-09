package Exercises_10.SecondExercise;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(double percent) {
        double increase = salary * (percent / 100);
        salary = salary + increase;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + getName() + ", Salary=" + salary + "]";
    }
}