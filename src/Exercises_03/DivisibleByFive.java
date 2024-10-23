package Exercises_03;

public class DivisibleByFive {
    public static void main(String[] args) {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int num : list) {
            if (num > 150){
                break;
            } else if (num % 5 ==0){
                System.out.println("Divisible by 5: " + num);
            }
        }
    }
}