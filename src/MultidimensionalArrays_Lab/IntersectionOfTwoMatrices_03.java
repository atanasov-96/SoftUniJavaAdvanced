package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < columns; col++) {
                firstMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        char[][] secondMatrix = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < columns; col++) {
                secondMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]){
                    System.out.print(firstMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
