package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        StringBuilder currentUrl = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();

            if ("Home".equals(input)) {
                break;
            }
            if ("back".equals(input)) {
                if (browserHistory.size() > 1) {
                    browserHistory.pop();
                    currentUrl.setLength(0);
                    currentUrl.append(browserHistory.peek());

                    System.out.println(currentUrl);
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                browserHistory.push(input);

                currentUrl.setLength(0);
                currentUrl.append(browserHistory.peek());

                System.out.println(currentUrl);
            }
        }
    }
}
