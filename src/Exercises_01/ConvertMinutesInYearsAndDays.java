package Exercises_01;

import java.util.Scanner;

public class ConvertMinutesInYearsAndDays {
    public static void main(String[] args) {
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        short daysInYear = 365;

        int minutesInYear = minutesInHour * hoursInDay * daysInYear;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter number of minutes: ");
        double minutes = Double.parseDouble(scanner.nextLine());

        double years = (minutes / minutesInYear);
        double days = (minutes / minutesInHour / hoursInDay) % daysInYear;

        System.out.println(minutes + " minutes is approximately "
                + years + " years and " + days + " days");
    }
}