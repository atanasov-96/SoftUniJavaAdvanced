package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
           String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("1")) {
                numbers.push(Integer.valueOf(input[1]));
            } else if (input[0].equals("2")) {
                numbers.pop();
            } else {
                int largestNum = numbers.isEmpty() ? 0 : Collections.max(numbers);
                System.out.println(largestNum);
            }
        }
    }
}
