package Exercises_07.StudentMethod;

import java.util.ArrayList;

public class StudentGrades {
    public static void main(String[] args) {
        ArrayList<Float> gradesFirst = new ArrayList<>();
        gradesFirst.add(4.75f);
        gradesFirst.add(5.25f);
        gradesFirst.add(5.75f);

        ArrayList<Float> gradesSecond = new ArrayList<>();
        gradesSecond.add(5.25f);
        gradesSecond.add(5.75f);
        gradesSecond.add(6.00f);

        Student firstStudent = new Student("Nikol", gradesFirst);
        Student secondStudent = new Student("Natali", gradesSecond);

        firstStudent.displayStudentInfo();
        secondStudent.displayStudentInfo();
    }
}