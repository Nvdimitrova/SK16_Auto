package Tips.Arrays.MultidimensionalArray;

public class ChangeElement {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        myNumbers[1][2] = 9;
//        Outputs 9 instead of 7
        System.out.println(myNumbers[1][2]);
    }
}