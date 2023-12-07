package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operators = scanner.nextLine().split(" ");
        int offerCount = Integer.parseInt(operators[0]);
        int pollCount = Integer.parseInt(operators[1]);
        int checkElement = Integer.parseInt(operators[2]);
        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int offer = 0; offer < offerCount; offer++) {
            queue.offer(Integer.valueOf(numbers[offer]));
        }
        for (int poll = 0; poll < pollCount; poll++) {
            queue.poll();
        }
        if (queue.contains(checkElement)) {
            System.out.println("true");
        } else {
            int smallestNum = queue.isEmpty() ? 0 : Collections.min(queue);
            System.out.println(smallestNum);
        }

    }
}
