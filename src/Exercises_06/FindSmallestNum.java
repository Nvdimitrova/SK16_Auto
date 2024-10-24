package Exercises_06;

public class FindSmallestNum {
    public static void main(String[] args) {
        int smallestNum = findSmallestNumFromThree(77, 11, -1);
        System.out.println(smallestNum);
    }

    public static int findSmallestNumFromThree(int firstNum, int secondNum, int thirdNum) {
        int smallestNum;

        if (firstNum < secondNum){
            smallestNum = firstNum;
        } else {
            smallestNum = Math.min(secondNum, thirdNum);
        }
        return smallestNum;
    }
}