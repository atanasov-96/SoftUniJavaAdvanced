package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] operators = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int pushCount = Integer.parseInt(operators[0]);
        for (int push = 0; push < pushCount; push++) {
            stack.push(Integer.valueOf(numbers[push]));
        }

        int popCount = Integer.parseInt(operators[1]);
        for (int pop = 0; pop < popCount; pop++) {
            stack.pop();
        }

        int checkNumber = Integer.parseInt(operators[2]);
        if (stack.contains(checkNumber)){
            System.out.println("true");
        } else {
            int smallestNum = stack.isEmpty() ? 0 : Collections.min(stack);
            System.out.println(smallestNum);
        }

    }
}
