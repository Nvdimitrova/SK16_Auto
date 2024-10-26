package Tips.Methods;

public class ReturnValues {
    public static void main(String[] args) {
        int sumResult = sumNumbers(3,7);
        System.out.println(sumResult);

    }

    public static int sumNumbers(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
}