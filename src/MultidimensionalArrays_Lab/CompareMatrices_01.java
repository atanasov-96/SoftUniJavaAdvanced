package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsCols[0]);
        int columns = Integer.parseInt(rowsCols[1]);

        int[][] firstMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = arr;
        }

        rowsCols = scanner.nextLine().split("\\s+");
        rows = Integer.parseInt(rowsCols[0]);
        columns = Integer.parseInt(rowsCols[1]);

        int[][] secondMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[i] = arr;
        }

        boolean equal = firstMatrix.length == secondMatrix.length;

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                equal = false;
                break;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}

