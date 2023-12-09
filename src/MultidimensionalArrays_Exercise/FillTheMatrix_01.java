package MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matrixAttributes = scanner.nextLine();
        int size = Integer.parseInt(matrixAttributes.split(", ")[0]);
        String type = matrixAttributes.split(", ")[1];

        int[][] matrix = new int[size][size];
        if (type.equals("A")) {
            fillMatrixTypeA(matrix);
        } else if (type.equals("B")) {
            fillMatrixTypeB(matrix);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void fillMatrixTypeA(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    public static void fillMatrixTypeB(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = count;
                    count++;
                }
            }
        }
    }
}
