package Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parenthesis = scanner.nextLine();

        ArrayDeque<Character> leftParenthesis = new ArrayDeque<>();
        boolean areBalanced = false;

        if (parenthesis.length() % 2 == 0) {
            for (int index = 0; index < parenthesis.length(); index++) {
                char currParenthesis = parenthesis.charAt(index);
                if (currParenthesis == '{' || currParenthesis == '[' || currParenthesis == '(') {
                    leftParenthesis.push(currParenthesis);
                } else if (currParenthesis == '}' || currParenthesis == ']' || currParenthesis == ')') {
                    char lastOpen = leftParenthesis.pop();
                    if (currParenthesis == '}' && lastOpen == '{') {
                        areBalanced = true;
                    } else if (currParenthesis == ']' && lastOpen == '[') {
                        areBalanced = true;
                    } else if (currParenthesis == ')' && lastOpen == '(') {
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
