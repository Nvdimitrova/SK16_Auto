package Exercises_06;

public class CalculateAverage {
    public static void main(String[] args) {
        double averageNum = computeAverage(10.5, 37.3, 50);
        System.out.println(averageNum);
    }

    public static double computeAverage(double firstNum, double secondNum, double thirdNum) {
        double averageNum = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average is: " + averageNum);
        return averageNum;
    }
}