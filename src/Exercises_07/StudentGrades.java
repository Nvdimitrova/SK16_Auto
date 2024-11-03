package Exercises_07;

import java.util.ArrayList;

public class StudentGrades {
    public static void main(String[] args) {
        ArrayList<Double> gradesFirst = new ArrayList<>();
        gradesFirst.add(4.75);
        gradesFirst.add(5.25);
        gradesFirst.add(5.75);

        ArrayList<Double> gradesSecond = new ArrayList<>();
        gradesSecond.add(5.25);
        gradesSecond.add(5.75);
        gradesSecond.add(6.00);

        Student firstStudent = new Student("Nikol", gradesFirst);
        Student secondStudent = new Student("Natali", gradesSecond);

        firstStudent.displayStudentInfo();
        System.out.println();
        secondStudent.displayStudentInfo();
    }
}