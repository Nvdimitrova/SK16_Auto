package Exercises_04;

public class SumNumbers {
    public static void main(String[] args) {
        int[] list = {3, 17, 77, 177};
        int sum = 0;

        for (int num : list) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}