package Exercises_06;

public class CalculateAverage {
    public static void main(String[] args) {
        double averageNum = computeAverage(10.5, 37.3, 50);
        System.out.println(averageNum);
    }

    public static double computeAverage(double firstNum, double secondNum, double thirdNum) {
        return (firstNum + secondNum + thirdNum) / 3;
    }
}