package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            matrix[row] = numbers;
        }

        int checkNum = Integer.parseInt(scanner.nextLine());

        boolean foundNum = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int col = 0; col < matrix[r].length; col++) {
                if (checkNum == matrix[r][col]) {
                    System.out.printf("%d %d%n",r, col);
                    foundNum = true;
                }
            }
        }
        if (!foundNum) {
            System.out.println("not found");
        }
    }
}
