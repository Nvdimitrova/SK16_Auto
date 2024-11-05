package Exercises_07.StudentMethod;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Float> grades;

    public Student(String name, ArrayList<Float> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double CalculateAverageGrade() {
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.printf("Average grade: %.2f ", CalculateAverageGrade());
        System.out.println();
    }
}