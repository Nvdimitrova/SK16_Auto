package Exercises_04;

public class SumNumbers {
    public static void main(String[] args) {
        int[] list = {3, 7, 11, 21};
        int sum = 0;

        for (double num : list) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}

/*
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        is identical to:

        for (double num : numbers) {
            sum += num;
        }
 */