package Stacks_And_Queues_Exercise;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandCount = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commandCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            int command = Integer.parseInt(input[0]);

            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int max = stack.isEmpty() ? 0 : Collections.max(stack);
                    System.out.println(max);
                    break;

            }
        }
    }
}
