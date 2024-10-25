package Exercises_06;

public class FindSmallestNum {
    public static void main(String[] args) {
        int smallestNum = findSmallestNum(77, 0, -1);
        System.out.println(smallestNum);
    }

    public static int findSmallestNum(int firstNum, int secondNum, int thirdNum) {
        int smallestNum = 0;

        if (firstNum < secondNum){
            smallestNum = firstNum;
        } else {
            smallestNum = Math.min(secondNum, thirdNum);
        }
        return smallestNum;
    }
}