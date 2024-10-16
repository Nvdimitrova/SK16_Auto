package Exercises_03;

public class Divisible_By_Five {
    public static void main(String[] args) {
        int[] list1 = {10, 15, 33, 44, 55, 75, 122, 133, 200};

        for (int number : list1) {
            if (number > 150) {
                break;
            }

            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
