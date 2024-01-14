package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backStack = new ArrayDeque<>();
        ArrayDeque<String> forwardQueue = new ArrayDeque<>();

        String currentUrl;
        String mostRecentUrl = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals(("Home"))) {
                break;
            }

            if (input.equals("back")) {
                if (backStack.size() > 1) {
                    mostRecentUrl = backStack.pop();
                    forwardQueue.addFirst(mostRecentUrl);
                    currentUrl = backStack.peek();
                    System.out.println(currentUrl);
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (!forwardQueue.isEmpty()) {
                    backStack.push(mostRecentUrl);
                    currentUrl = forwardQueue.poll();
                    System.out.println(currentUrl);
                } else {
                    System.out.println("no next URLs");
                }

            } else {
                backStack.push(input);
                currentUrl = backStack.peek();
                System.out.println(currentUrl);
                forwardQueue.clear();
            }
        }
    }
}
