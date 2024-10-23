package Exercises_03;

public class SkippingNumbers {
    public static void main(String[] args) {
        int[] list = {3, 4, 7, 12, 16, 17, 24, 33, 45};

        for (int num : list){
            if (num % 3 == 0){
                continue;
            } else {
                System.out.println(num);
            }
        }
    }
}