package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            reversed.push(tokens[i]);
        }
        while (!reversed.isEmpty()) {
            System.out.print(reversed.pop());
            if (!reversed.isEmpty()){
                System.out.print(" ");
            }
        }
    }
}
