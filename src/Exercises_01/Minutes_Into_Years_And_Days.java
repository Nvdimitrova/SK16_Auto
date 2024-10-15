package Exercises_01;

import java.util.Scanner;

public class Minutes_Into_Years_And_Days {
    public static void main(String[] args) {
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        short daysInYear = 365;
        int minutesInYear = minutesInHour * hoursInDay * daysInYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextLong();
        double years = (min / minutesInYear);
        double days = (min / minutesInHour / hoursInDay) % daysInYear;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
