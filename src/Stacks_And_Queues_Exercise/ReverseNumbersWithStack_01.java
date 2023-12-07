package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> reversed = new ArrayDeque<>();

        for (String number : numbers) {
            reversed.push(Integer.valueOf(number));
        }
        for (Integer i : reversed) {
            System.out.print(i + " ");
        }
    }
}
