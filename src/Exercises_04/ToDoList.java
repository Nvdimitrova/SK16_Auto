package Exercises_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        toDoList.add("Spend at least 2 hours learning Java");
        toDoList.add("Do your homework");
        toDoList.add("Clean the house");
        toDoList.add("Go to the gym");

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("To-Do list: " + i + " " + toDoList.get(i));
        }

        System.out.print("Please, enter the number of the task you have completed: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid number. No task was removed.");
        }

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Updated To-Do List: " + i + " " + toDoList.get(i));
        }

        System.out.print("Please, enter a task you want to add to your To-Do list: ");
        String newTask = scanner.nextLine();

        toDoList.add(newTask);
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Updated To-Do list: " + i + " " + toDoList.get(i));
        }
        scanner.close();
    }
}