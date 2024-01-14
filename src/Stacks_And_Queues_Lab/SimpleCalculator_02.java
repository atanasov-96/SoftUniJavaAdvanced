package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;

import java.util.List;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> tokens = new ArrayDeque<>(List.of(input));
        while (tokens.size() > 1) {
            int firstNum = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());
            int result = 0;

            if ("+".equals(operator)) {
                result = firstNum + secondNum;
            } else if ("-".equals(operator)) {
                result = firstNum - secondNum;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.pop());
    }
}
