package Exercises_04;

import java.util.Arrays;
import java.util.*;

public class PrintDynamicMatrixElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please, enter number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.printf("matrix[%d,%d] = ", row, column);
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("The matrix is created: " + Arrays.deepToString(matrix));
        input.close();
    }
}