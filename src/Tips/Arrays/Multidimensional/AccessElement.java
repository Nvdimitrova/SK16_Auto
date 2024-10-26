package Tips.Arrays.Multidimensional;

public class AccessElement {
    public static void main(String[] args) {

        /*
        To access the elements of the myNumbers array, specify two indexes:
        one for the array,
        and one for the element inside that array.

        The example below accesses the third element (2)
        in the second array (1) of myNumbers:
         */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);
    }
}