package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operators = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int queCount = Integer.parseInt(operators[0]);
        for (int q = 0; q < queCount; q++) {
            queue.offer(Integer.valueOf(numbers[q]));
        }

        int dequeCount = Integer.parseInt(operators[1]);
        for (int dq = 0; dq < dequeCount; dq++) {
            queue.poll();
        }

        int checkNumber = Integer.parseInt(operators[2]);
        if (queue.contains(checkNumber)){
            System.out.println("true");
        } else {
            int smallestNum = queue.isEmpty() ? 0 : Collections.min(queue);
            System.out.println(smallestNum);
        }

    }
}
