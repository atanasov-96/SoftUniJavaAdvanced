package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2Submatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(matrixSize[0]);
        int columns = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            matrix[row] = numbers;
        }


        int maxSum = 0;
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < columns - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        for (int row = rowIndex; row <= rowIndex + 1; row++) {
            for (int col = colIndex; col <= colIndex + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
