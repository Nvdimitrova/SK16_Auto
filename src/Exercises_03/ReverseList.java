package Exercises_03;

public class ReverseList {
    public static void main(String[] args) {
        int[] list =  {10, 20, 30, 40, 50};

        for (int i = list.length - 1; i >= 0; i--){
            System.out.print(list[i] + " ");
        }
    }
}