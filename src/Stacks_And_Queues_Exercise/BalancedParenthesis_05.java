package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parenthesis = scanner.nextLine();

        ArrayDeque<Character> openingParenthesis = new ArrayDeque<>();

        boolean areBalanced = false;

        if (parenthesis.length() % 2 == 0) {

            for (int i = 0; i < parenthesis.length(); i++) {
                char currParenthesis = parenthesis.charAt(i);

                if (currParenthesis == '(' || currParenthesis == '{' || currParenthesis == '[') {
                    openingParenthesis.push(currParenthesis);
                } else if (currParenthesis == ')' || currParenthesis == '}' || currParenthesis == ']') {
                    char lastOpen = openingParenthesis.pop();

                    if (currParenthesis == ')' && lastOpen == '(' || currParenthesis == '}' && lastOpen == '{' || currParenthesis == ']' && lastOpen == '[') {
                        areBalanced = true;
                    } else {
                        areBalanced = false;
                        break;
                    }
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
