package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenInQueue = new ArrayDeque<>();

        for (int i = 0; i < children.length ; i++) {
            childrenInQueue.offer(children[i]);
        }
        while (childrenInQueue.size() != 1) {
            for (int i = 1; i < numberOfTurns; i++) {
                String currChild = childrenInQueue.poll();
                childrenInQueue.offer(currChild);
            }
            String childToRemove = childrenInQueue.poll();
            System.out.println("Removed " + childToRemove);
        }
        System.out.printf("Last is %s", childrenInQueue.poll());
    }
}
