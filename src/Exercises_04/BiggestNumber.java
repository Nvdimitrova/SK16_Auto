package Exercises_04;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] list = {11, 22, 33, 444, 555, 66};

        int largestNumber = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > largestNumber) {
                largestNumber = list[i];
            }
        }
        System.out.println("Largest number is: " + largestNumber);
    }
}