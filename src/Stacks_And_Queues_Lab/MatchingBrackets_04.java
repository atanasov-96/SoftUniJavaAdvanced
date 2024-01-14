package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == '(') {
                stack.push(i);
            } else if (curr == ')') {
                int startIndex = stack.pop();
                String match = input.substring(startIndex, i + 1);
                System.out.println(match);
            }
        }
    }
}
