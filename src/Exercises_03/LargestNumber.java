package Exercises_03;

public class LargestNumber {
    public static void main(String[] args) {

        int [] list = {11,22,33,444,555,66};

        int largestNumber = list[0];

        for (int i = 1; i < list.length; i++){
            if (list [i] > largestNumber){
                largestNumber = list [i];
            }
        }
        System.out.println("Largest number is: " + largestNumber);

    }
}

//        int firstNumber = 11;
//        int secondNumber = 22;
//        int thirdNumber = 33;
//        int fourthNumber = 444;
//        int fifthNumber = 555;
//        int sixthNumber = 66;
//
//        int largestNumber = firstNumber;
//
//        if (firstNumber > largestNumber) {
//            largestNumber = firstNumber;
//        }
//        if (secondNumber > largestNumber) {
//            largestNumber = secondNumber;
//        }
//        if (thirdNumber > largestNumber) {
//            largestNumber = thirdNumber;
//        }
//        if (fourthNumber > largestNumber) {
//            largestNumber = fourthNumber;
//        }
//        if (fifthNumber > largestNumber) {
//            largestNumber = fifthNumber;
//        }
//        if (sixthNumber > largestNumber) {
//            largestNumber = sixthNumber;
//        }
//        System.out.println("Largest number is: " + largestNumber);
//    }
//}
