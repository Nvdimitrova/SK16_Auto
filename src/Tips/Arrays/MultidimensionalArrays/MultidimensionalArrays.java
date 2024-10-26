package Tips.Arrays.MultidimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        A multidimensional array is an array of arrays.

        Multidimensional arrays are useful
        when you want to store data as a tabular form,
        like a table with rows and columns.
         */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(myNumbers));
    }
}