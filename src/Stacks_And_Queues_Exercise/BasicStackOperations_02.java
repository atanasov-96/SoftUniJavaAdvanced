package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operators = scanner.nextLine().split(" ");
        int pushCount = Integer.parseInt(operators[0]);
        int popCount = Integer.parseInt(operators[1]);
        int checkElement = Integer.parseInt(operators[2]);
        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int push = 0; push < pushCount; push++) {
            stack.push(Integer.valueOf(numbers[push]));
        }
        for (int pop = 0; pop < popCount; pop++) {
            stack.pop();
        }
        if (stack.contains(checkElement)) {
            System.out.println("true");
        } else {
            int smallestNum = stack.isEmpty() ? 0 : Collections.min(stack);
            System.out.println(smallestNum);
        }

    }
}
