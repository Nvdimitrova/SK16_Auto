package Tips.Arrays.Multidimensional;

public class Loop {
    public static void main(String[] args) {

//        The following example outputs all elements in the myNumbers array:

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}