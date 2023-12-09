package MultidimensionalArrays_Exercise;

import java.util.Map;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix,scanner);

        int sumPrimary = getSumPrimaryDiagonal(matrix);
        int sumSecondary = getSumSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimary - sumSecondary));
    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currElement = matrix[row][col];
                if (col == matrix.length - row - 1) {
                    sum += currElement;
                }
            }
        }
        return sum;
    }

    private static int getSumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currElement = matrix[row][col];
                if (row == col) {
                    sum += currElement;
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] rowOfMatrix = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }
    }
}
