package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operationsCount = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        Deque<String> previousTextState = new ArrayDeque<>();

        for (int o = 0; o < operationsCount; o++) {
            String[] input = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            switch (command) {
                case 1:
                    previousTextState.push(String.valueOf(text));
                    String toAppend = input[1];
                    text.append(toAppend);
                    break;
                case 2:
                    previousTextState.push(String.valueOf(text));
                    int eraseCount = Integer.parseInt(input[1]);
                    text.delete(text.length() - eraseCount, text.length());
                    break;
                case 3:
                    int returnIndex = Integer.parseInt(input[1]) - 1;
                    System.out.println(text.charAt(returnIndex));
                    break;
                case 4:
                    text.setLength(0);
                    text.append(previousTextState.pop());
                    break;
            }
        }
    }
}
