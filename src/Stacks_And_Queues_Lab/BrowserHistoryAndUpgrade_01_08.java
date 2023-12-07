package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryAndUpgrade_01_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String currentUrl = "";
        String mostRecentUrl = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals(("Home"))) {
                break;
            }

            if (input.equals("back")) {
                if (browserHistory.size() > 1) {
                    mostRecentUrl = browserHistory.pop();
                    currentUrl = browserHistory.peek();
                    System.out.println(currentUrl);
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (browserHistory.peek() != mostRecentUrl) {
                    browserHistory.push(mostRecentUrl);
                    currentUrl = browserHistory.peek();
                    mostRecentUrl = "";
                    System.out.println(currentUrl);
                } else {
                    System.out.println("no next URLs");
                }

            } else {
                browserHistory.push(input);
                currentUrl = browserHistory.peek();
                System.out.println(currentUrl);
            }
        }
    }
}
