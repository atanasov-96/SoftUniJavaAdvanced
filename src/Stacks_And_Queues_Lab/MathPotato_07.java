package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> childrenInQueue = new PriorityQueue<>();

        for (int i = 0; i < children.length; i++) {
            childrenInQueue.offer(children[i]);
        }

        int cycle = 1;
        while (childrenInQueue.size() != 1) {
            for (int i = 1; i < numberOfTurns; i++) {
                String currChild = childrenInQueue.poll();
                if (currChild != null) {
                    childrenInQueue.offer(currChild);
                }
            }
            if (isPrime(cycle)){
                System.out.printf("Prime %s%n", childrenInQueue.peek());
            } else {
                String childToRemove = childrenInQueue.poll();
                System.out.println("Removed " + childToRemove);
            }
            cycle++;
        }
        System.out.printf("Last is %s", childrenInQueue.poll());
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

