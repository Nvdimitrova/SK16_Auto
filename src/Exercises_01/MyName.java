package Exercises_01;

//import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        String firstName = "Nikol";
        String secondName = "Valentinova";
        String lastName = "Dimitrova";

        String myName = firstName + " " + secondName + " " + lastName;

        System.out.println("My name is: " + myName);
    }
}

/*
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter your first name");
    String firstName = scanner.nextLine();
    System.out.println("Please, enter your second name");
    String secondName = scanner.nextLine();
    System.out.println("Please, enter your last name");
    String lastName = scanner.nextLine();

    String yourName = firstName + " " + secondName + " " + lastName;

    System.out.println("Your name is: " + yourName);
    }
}

 */

