package Stacks_And_Queues_Exercise;

import java.util.*;

public class RecursiveFibonacci_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayDeque<Long> queue = new ArrayDeque<>();
        long N = Integer.parseInt(input.nextLine());

        if (N < 2) {
            System.out.println(1L);
        } else {
            queue.offer(0L);
            queue.offer(1L);
            for (int i = 0; i < N; i++) {
                long Sum = queue.poll() + queue.peek();
                queue.offer(Sum);
            }
        }
        queue.poll();
        System.out.println(queue.peek());
    }
}
