package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeOfMatrix = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int columns = Integer.parseInt(sizeOfMatrix[1]);

        int[][] matrix = new int[rows][columns];


        for (int row = 0; row < rows; row++) {
            String[] rowOfMatrix = scanner.nextLine().split(", ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                sum+= matrix[r][c];
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);

    }
}
